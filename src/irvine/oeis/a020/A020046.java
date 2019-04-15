package irvine.oeis.a020;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020046 Integer part of GAMMA(n+11/12)/GAMMA(11/12).
 * @author Sean A. Irvine
 */
public class A020046 implements Sequence {

  private static final Q C = new Q(11, 12);
  private int mN = -2;
  private Q mA = Q.ONE;

  @Override
  public Z next() {
    if (++mN >= 0) {
      mA = mA.multiply(C.add(mN));
    }
    return mA.floor();
  }
}
