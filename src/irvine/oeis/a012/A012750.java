package irvine.oeis.a012;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A012750 exp(arctanh(x)*sinh(x)) = 1+2/2!*x^2+24/4!*x^4+670/6!*x^6+34664/8!*x^8...
 * @author Sean A. Irvine
 */
public class A012750 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -2;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    mN += 2;
    if (mN == 0) {
      return Z.ONE;
    }
    mF = mF.multiply(mN).multiply(mN - 1);
    return RING.exp(RING.multiply(RING.atanh(RING.x(), mN), RING.sinh(RING.x(), mN), mN), mN).coeff(mN).multiply(mF).toZ();
  }
}
