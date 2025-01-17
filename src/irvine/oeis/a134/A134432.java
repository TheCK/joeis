package irvine.oeis.a134;
// Generated by gen_seq4.pl egfsi at 2021-12-01 15:37

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A134432 Sum of entries in all the arrangements of the set {1,2,...,n} (to n=0 there corresponds the empty set).
 * E.g.f.: exp(x)*x*(2 + x - x^2) / (2*(1 - x)^3)
 * @author Georg Fischer
 */
public class A134432 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN != 0) {
      mF = mF.multiply(mN);
    }
    return RING.series(RING.multiply(RING.multiply(RING.exp(RING.x(), mN), RING.x(), mN), RING.subtract(RING.add(RING.monomial(Q.TWO, 0), RING.x()), RING.pow(RING.x(), 2, mN)), mN), RING.multiply(RING.monomial(Q.TWO, 0), RING.pow(RING.oneMinusXToTheN(1), 3, mN), mN), mN).coeff(mN).multiply(mF).toZ();
  }
}
