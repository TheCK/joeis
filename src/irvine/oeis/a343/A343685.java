package irvine.oeis.a343;
// Generated by gen_seq4.pl egfsi at 2021-12-01 15:37

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A343685 a(0) = 1; a(n) = 2 * n * a(n-1) + Sum_{k=0..n-1} binomial(n,k) * (n-k-1)! * a(k).
 * E.g.f.: 1 / (1 - 2*x + log(1 - x))
 * @author Georg Fischer
 */
public class A343685 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN != 0) {
      mF = mF.multiply(mN);
    }
    return RING.series(RING.one(), RING.add(RING.subtract(RING.one(), RING.monomial(Q.TWO, 1)), RING.log(RING.oneMinusXToTheN(1), mN)), mN).coeff(mN).multiply(mF).toZ();
  }
}
