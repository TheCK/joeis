package irvine.oeis.a012;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A012034 exp(sin(arcsinh(x))) = 1+x+1/2!*x^2-1/3!*x^3-7/4!*x^4+1/5!*x^5...
 * @author Sean A. Irvine
 */
public class A012034 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    mF = mF.multiply(mN);
    return RING.exp(RING.sin(RING.asinh(RING.x(), mN), mN), mN).coeff(mN).multiply(mF).toZ();
  }
}
