package irvine.oeis.a013;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013112 cosh(arcsinh(x)+arctan(x))=1+4/2!*x^2-8/4!*x^4+70/6!*x^6-920/8!*x^8...
 * @author Sean A. Irvine
 */
public class A013112 implements Sequence {

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
    return RING.cosh(RING.add(RING.asinh(RING.x(), mN), RING.atan(RING.x(), mN)), mN).coeff(mN).multiply(mF).toZ();
  }
}
