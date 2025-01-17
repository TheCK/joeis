package irvine.oeis.a066;
// Generated by gen_seq4.pl egfsi at 2021-12-01 15:37

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A066052 Number of permutations in the symmetric group S_n with order &gt;= 3.
 * E.g.f.: 1/(1-x) - exp(x*(x+2)/2)
 * @author Georg Fischer
 */
public class A066052 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = 0;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN != 0) {
      mF = mF.multiply(mN);
    }
    return RING.subtract(RING.series(RING.one(), RING.oneMinusXToTheN(1), mN), RING.exp(RING.series(RING.multiply(RING.x(), RING.add(RING.x(), RING.monomial(Q.TWO, 0)), mN), RING.monomial(Q.TWO, 0), mN), mN)).coeff(mN).multiply(mF).toZ();
  }
}
