package irvine.oeis.a186;
// Generated by gen_seq4.pl egfsi at 2021-12-01 15:37

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A186768 Number of nonincreasing odd cycles in all permutations of {1,2,...,n}. A cycle (b(1), b(2), ...) is said to be increasing if, when written with its smallest element in the first position, it satisfies b(1)&lt;b(2)&lt;b(3)&lt;... .  A cycle is said to be odd if it has an odd number of entries.
 * E.g.f.: (log((1+x)/(1-x))-2*sinh(x))/(2*(1-x))
 * @author Georg Fischer
 */
public class A186768 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN != 0) {
      mF = mF.multiply(mN);
    }
    return RING.series(RING.subtract(RING.log(RING.series(RING.onePlusXToTheN(1), RING.oneMinusXToTheN(1), mN), mN), RING.multiply(RING.monomial(Q.TWO, 0), RING.sinh(RING.x(), mN), mN)), RING.multiply(RING.monomial(Q.TWO, 0), RING.oneMinusXToTheN(1), mN), mN).coeff(mN).multiply(mF).toZ();
  }
}
