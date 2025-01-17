package irvine.oeis.a187;
// Generated by gen_seq4.pl egfsi at 2021-12-01 15:37

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A187246 Number of cycles with 2 alternating runs in all permutations of [n] (it is assumed that the smallest element of the cycle is in the first position).
 * E.g.f.: (1/4)(3+2*x+exp(2*x)-4*exp(x))/(1-x)
 * @author Georg Fischer
 */
public class A187246 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN != 0) {
      mF = mF.multiply(mN);
    }
    return RING.series(RING.multiply(RING.series(RING.one(), RING.monomial(Q.FOUR, 0), mN), RING.subtract(RING.add(RING.add(RING.monomial(Q.THREE, 0), RING.monomial(Q.TWO, 1)), RING.exp(RING.monomial(Q.TWO, 1), mN)), RING.multiply(RING.monomial(Q.FOUR, 0), RING.exp(RING.x(), mN), mN)), mN), RING.oneMinusXToTheN(1), mN).coeff(mN).multiply(mF).toZ();
  }
}
