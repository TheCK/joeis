package irvine.oeis.a009;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A009620 Expansion of sinh(x)*cos(tan(x)).
 * @author Sean A. Irvine
 */
public class A009620 implements Sequence {

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
    return RING.multiply(RING.cos(RING.tan(RING.x(), mN), mN), RING.sinh(RING.x(), mN), mN).coeff(mN).multiply(mF).toZ();
  }
}
