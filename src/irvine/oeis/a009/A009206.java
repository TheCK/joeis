package irvine.oeis.a009;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A009206 Expansion of e.g.f.: exp(sin(x))*x.
 * @author Sean A. Irvine
 */
public class A009206 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    mF = mF.multiply(mN);
    return RING.exp(RING.sin(RING.x(), mN - 1), mN - 1).coeff(mN - 1).multiply(mF).toZ();
  }
}
