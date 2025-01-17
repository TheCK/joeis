package irvine.oeis.a009;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A009696 Expansion of tan(tan(x))*cosh(x) (odd powers only).
 * @author Sean A. Irvine
 */
public class A009696 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    mN += 2;
    if (mN == 1) {
      return Z.ONE;
    }
    mF = mF.multiply(mN).multiply(mN - 1);
    return RING.multiply(RING.tan(RING.tan(RING.x(), mN), mN), RING.cosh(RING.x(), mN), mN).coeff(mN).multiply(mF).toZ();
  }
}
