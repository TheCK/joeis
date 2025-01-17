package irvine.oeis.a330;
// Generated by gen_seq4.pl egfsi at 2021-12-01 15:37

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A330041 Expansion of e.g.f. exp(cosh(exp(x) - 1) - 1).
 * E.g.f.: exp(cosh(exp(x) - 1) - 1)
 * @author Georg Fischer
 */
public class A330041 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN != 0) {
      mF = mF.multiply(mN);
    }
    return RING.exp(RING.subtract(RING.cosh(RING.subtract(RING.exp(RING.x(), mN), RING.one()), mN), RING.one()), mN).coeff(mN).multiply(mF).toZ();
  }
}
