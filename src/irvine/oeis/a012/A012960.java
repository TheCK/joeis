package irvine.oeis.a012;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A012960 Expansion of e.g.f. exp(arctan(x)+log(x+1)).
 * @author Sean A. Irvine
 */
public class A012960 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    mF = mF.multiply(mN);
    return RING.exp(RING.add(RING.atan(RING.x(), mN), RING.log1p(RING.x(), mN)), mN).coeff(mN).multiply(mF).toZ();
  }
}
