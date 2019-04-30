package irvine.oeis.a020;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020005 Nearest integer to <code>GAMMA(n+10/11)/GAMMA(10/11)</code>.
 * @author Sean A. Irvine
 */
public class A020005 implements Sequence {

  private static final Q C = new Q(10, 11);
  private int mN = -2;
  private Q mA = Q.ONE;

  @Override
  public Z next() {
    if (++mN >= 0) {
      mA = mA.multiply(C.add(mN));
    }
    return mA.add(Q.HALF).floor();
  }
}
