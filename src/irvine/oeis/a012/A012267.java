package irvine.oeis.a012;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A012267 Expansion of e.g.f. <code>arcsin(log(x+1)^2)</code>.
 * @author Sean A. Irvine
 */
public class A012267 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    mF = mF.multiply(mN);
    return RING.asin(RING.pow(RING.log1p(RING.x(), mN), 2, mN), mN).coeff(mN).multiply(mF).toZ();
  }
}
