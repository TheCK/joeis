package irvine.oeis.a024;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024397 <code>s(1)*s(2)*...*s(n+1)*(1/s(2) - 1/s(3) + ... + c/s(n+1))</code>, where c <code>= (-1)^(n+1)</code> and <code>s(k) = 3k-1</code> for k <code>= 1,2,3,..</code>.
 * @author Sean A. Irvine
 */
public class A024397 implements Sequence {

  private long mN = 1;
  private Z mA = Z.TWO;
  private Q mB = Q.ZERO;

  @Override
  public Z next() {
    final long m = 3 * ++mN - 1;
    mA = mA.multiply(m);
    mB = mB.signedAdd((mN & 1) == 0, new Q(1, m));
    return mB.multiply(mA).toZ();
  }
}