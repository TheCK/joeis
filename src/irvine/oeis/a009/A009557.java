package irvine.oeis.a009;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A009557 Expansion of e.g.f. sin(x)/cosh(log(1+x)).
 * @author Sean A. Irvine
 */
public class A009557 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    mF = mF.multiply(mN);
    return RING.coeff(RING.sin(RING.x(), mN), RING.cosh(RING.log1p(RING.x(), mN), mN), mN).multiply(mF).toZ();
  }
}
