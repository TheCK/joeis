package irvine.oeis.a024;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024720 <code>a(n) = (1/4)*(3 +</code> sum of <code>C(4k,k))</code> for k <code>= 0,1,2,...,n</code>.
 * @author Sean A. Irvine
 */
public class A024720 implements Sequence {

  private Z mSum = Z.THREE;
  private long mN = -1;

  @Override
  public Z next() {
    mSum = mSum.add(Binomial.binomial(4 * ++mN, mN));
    return mSum.divide(4);
  }
}