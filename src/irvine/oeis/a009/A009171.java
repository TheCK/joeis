package irvine.oeis.a009;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A009171 Expansion of cosh(tanh(x)*exp(x)).
 * @author Sean A. Irvine
 */
public class A009171 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    mF = mF.multiply(mN);
    return RING.cosh(RING.multiply(RING.tanh(RING.x(), mN), RING.exp(RING.x(), mN), mN), mN).coeff(mN).multiply(mF).toZ();
  }
}
