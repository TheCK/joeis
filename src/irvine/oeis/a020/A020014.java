package irvine.oeis.a020;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020014 Nearest integer to Gamma(n + 1/11)/Gamma(1/11).
 * @author Sean A. Irvine
 */
public class A020014 implements Sequence {

  private static final Q C = new Q(1, 11);
  private int mN = -2;
  private Q mA = Q.ONE;

  @Override
  public Z next() {
    if (++mN >= 0) {
      mA = mA.multiply(C.add(mN));
    }
    return mA.round();
  }
}
