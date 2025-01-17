package irvine.oeis.a339;
// Generated by gen_seq4.pl egfsi at 2021-12-01 15:37

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A339017 E.g.f.: exp(2 * (exp(x) - 1 - x - x^2 / 2 - x^3 / 6)).
 * E.g.f.: exp(2 * (exp(x) - 1 - x - x^2 / 2 - x^3 / 6))
 * @author Georg Fischer
 */
public class A339017 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN != 0) {
      mF = mF.multiply(mN);
    }
    return RING.exp(RING.multiply(RING.monomial(Q.TWO, 0), RING.subtract(RING.subtract(RING.subtract(RING.subtract(RING.exp(RING.x(), mN), RING.one()), RING.x()), RING.series(RING.pow(RING.x(), 2, mN), RING.monomial(Q.TWO, 0), mN)), RING.series(RING.pow(RING.x(), 3, mN), RING.monomial(Q.SIX, 0), mN)), mN), mN).coeff(mN).multiply(mF).toZ();
  }
}
