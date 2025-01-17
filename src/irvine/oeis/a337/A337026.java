package irvine.oeis.a337;
// Generated by gen_seq4.pl egfsi at 2021-12-01 15:37

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A337026 a(n) = (2/3) * Sum_{k&gt;=0} (2*k + 1)^n / 3^k.
 * E.g.f.: 2 * exp(x) / (3 - exp(2*x))
 * @author Georg Fischer
 */
public class A337026 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN != 0) {
      mF = mF.multiply(mN);
    }
    return RING.series(RING.multiply(RING.monomial(Q.TWO, 0), RING.exp(RING.x(), mN), mN), RING.subtract(RING.monomial(Q.THREE, 0), RING.exp(RING.monomial(Q.TWO, 1), mN)), mN).coeff(mN).multiply(mF).toZ();
  }
}
