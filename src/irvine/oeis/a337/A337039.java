package irvine.oeis.a337;
// Generated by gen_seq4.pl egfsim/egfsi at 2021-11-29 22:48

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A337039 a(n) = exp(-1/3) * Sum_{k&gt;=0} (3*k - 1)^n / (3^k * k!).
 * E.g.f.: exp((exp(3*x)-1)/3-x)
 * @author Georg Fischer
 */
public class A337039 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN != 0) {
      mF = mF.multiply(mN);
    }
    return RING.exp(RING.subtract(RING.divide(RING.subtract(RING.exp(RING.monomial(new Q(3, 1), 1), mN), RING.one()), new Q(3, 1)), RING.x()), mN).coeff(mN).multiply(mF).toZ();
  }
}
