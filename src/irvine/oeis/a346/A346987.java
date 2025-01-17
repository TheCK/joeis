package irvine.oeis.a346;
// Generated by gen_seq4.pl egfsi at 2021-12-01 15:37

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A346987 E.g.f.: 1 / (1 + 5 * log(1 - x))^(1/5).
 * E.g.f.: 1 / (1 + 5 * log(1 - x))^(1/5)
 * @author Georg Fischer
 */
public class A346987 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN != 0) {
      mF = mF.multiply(mN);
    }
    return RING.series(RING.one(), RING.exp(RING.multiply(RING.log(RING.add(RING.one(), RING.multiply(RING.monomial(Q.FIVE, 0), RING.log(RING.oneMinusXToTheN(1), mN), mN)), mN), RING.series(RING.one(), RING.monomial(Q.FIVE, 0), mN), mN), mN), mN).coeff(mN).multiply(mF).toZ();
  }
}
