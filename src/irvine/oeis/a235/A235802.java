package irvine.oeis.a235;
// Generated by gen_seq4.pl egfsi at 2021-12-01 15:37

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A235802 E.g.f.: 1/(1 - x)^(2/(2-x)).
 * E.g.f.: 1/(1 - x)^(2/(2-x))
 * @author Georg Fischer
 */
public class A235802 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN != 0) {
      mF = mF.multiply(mN);
    }
    return RING.series(RING.one(), RING.exp(RING.multiply(RING.log(RING.oneMinusXToTheN(1), mN), RING.series(RING.monomial(Q.TWO, 0), RING.subtract(RING.monomial(Q.TWO, 0), RING.x()), mN), mN), mN), mN).coeff(mN).multiply(mF).toZ();
  }
}
