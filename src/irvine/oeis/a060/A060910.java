package irvine.oeis.a060;
// Generated by gen_seq4.pl egfsi at 2021-12-01 15:37

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A060910 E.g.f.: exp(x*exp(x*exp(x)) + 1/2*x^2*exp(x*exp(x))^2 + 1/4*x^4*exp(x*exp(x))^4).
 * E.g.f.: exp(x*exp(x*exp(x)) + 1/2*x^2*exp(x*exp(x))^2 + 1/4*x^4*exp(x*exp(x))^4)
 * @author Georg Fischer
 */
public class A060910 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN != 0) {
      mF = mF.multiply(mN);
    }
    return RING.exp(RING.add(RING.add(RING.multiply(RING.x(), RING.exp(RING.multiply(RING.x(), RING.exp(RING.x(), mN), mN), mN), mN), RING.multiply(RING.multiply(RING.series(RING.one(), RING.monomial(Q.TWO, 0), mN), RING.pow(RING.x(), 2, mN), mN), RING.pow(RING.exp(RING.multiply(RING.x(), RING.exp(RING.x(), mN), mN), mN), 2, mN), mN)), RING.multiply(RING.multiply(RING.series(RING.one(), RING.monomial(Q.FOUR, 0), mN), RING.pow(RING.x(), 4, mN), mN), RING.pow(RING.exp(RING.multiply(RING.x(), RING.exp(RING.x(), mN), mN), mN), 4, mN), mN)), mN).coeff(mN).multiply(mF).toZ();
  }
}
