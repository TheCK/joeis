package irvine.oeis.a013;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013390 tan(arctanh(x)-sin(x)) = 3/3!*x^3 + 23/5!*x^5 + 721/7!*x^7 + 55439/9!*x^9...
 * @author Sean A. Irvine
 */
public class A013390 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    mN += 2;
    if (mN == 1) {
      return Z.ZERO;
    }
    mF = mF.multiply(mN).multiply(mN - 1);
    return RING.tan(RING.subtract(RING.atanh(RING.x(), mN), RING.sin(RING.x(), mN)), mN).coeff(mN).multiply(mF).toZ();
  }
}
