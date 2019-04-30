package irvine.oeis.a009;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A009576 Expansion of e.g.f. <code>sinh(log(1+x))/cos(x)</code>.
 * @author Sean A. Irvine
 */
public class A009576 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    mF = mF.multiply(mN);
    return RING.coeff(RING.sinh(RING.log1p(RING.x(), mN), mN), RING.cos(RING.x(), mN), mN).multiply(mF).toZ();
  }
}
