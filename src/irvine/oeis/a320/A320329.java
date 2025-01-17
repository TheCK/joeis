package irvine.oeis.a320;
// Generated by gen_seq4.pl egfsi at 2021-12-01 15:37

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A320329 Row sums of A174790.
 * E.g.f.: 1/sqrt(1 - 4*x) + exp(x)*(1 + x) + 1/(2*x - 1)
 * @author Georg Fischer
 */
public class A320329 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN != 0) {
      mF = mF.multiply(mN);
    }
    return RING.add(RING.add(RING.series(RING.one(), RING.sqrt(RING.subtract(RING.one(), RING.monomial(Q.FOUR, 1)), mN), mN), RING.multiply(RING.exp(RING.x(), mN), RING.onePlusXToTheN(1), mN)), RING.series(RING.one(), RING.subtract(RING.monomial(Q.TWO, 1), RING.one()), mN)).coeff(mN).multiply(mF).toZ();
  }
}
