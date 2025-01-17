package irvine.oeis.a343;
// Generated by gen_seq4.pl egfsi at 2021-12-01 15:37

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A343707 a(n) = 1 + 2 * Sum_{k=0..n-1} binomial(n,k) * (n-k-1)! * a(k).
 * E.g.f.: exp(x) / (1 + 2 * log(1 - x))
 * @author Georg Fischer
 */
public class A343707 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN != 0) {
      mF = mF.multiply(mN);
    }
    return RING.series(RING.exp(RING.x(), mN), RING.add(RING.one(), RING.multiply(RING.monomial(Q.TWO, 0), RING.log(RING.oneMinusXToTheN(1), mN), mN)), mN).coeff(mN).multiply(mF).toZ();
  }
}
