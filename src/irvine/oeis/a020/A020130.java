package irvine.oeis.a020;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020130 Ceiling of GAMMA(n+1/5)/GAMMA(1/5).
 * @author Sean A. Irvine
 */
public class A020130 implements Sequence {

  private static final Q C = new Q(1, 5);
  private int mN = -2;
  private Q mA = Q.ONE;

  @Override
  public Z next() {
    if (++mN >= 0) {
      mA = mA.multiply(C.add(mN));
    }
    return mA.ceiling();
  }
}
