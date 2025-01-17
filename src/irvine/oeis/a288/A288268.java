package irvine.oeis.a288;
// Generated by gen_seq4.pl egfsi at 2021-12-01 15:37

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A288268 Expansion of e.g.f.: exp(Sum_{k&gt;=1} (k-1)*x^k/k).
 * E.g.f.: (1 - x) * exp(x/(1 - x))
 * @author Georg Fischer
 */
public class A288268 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN != 0) {
      mF = mF.multiply(mN);
    }
    return RING.multiply(RING.oneMinusXToTheN(1), RING.exp(RING.series(RING.x(), RING.oneMinusXToTheN(1), mN), mN), mN).coeff(mN).multiply(mF).toZ();
  }
}
