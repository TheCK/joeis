package irvine.oeis.a020;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020125 Ceiling of <code>GAMMA(n+5/6)/GAMMA(5/6)</code>.
 * @author Sean A. Irvine
 */
public class A020125 implements Sequence {

  private static final Q C = new Q(5, 6);
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
