package irvine.oeis.a153;
// Generated by gen_seq4.pl egfsi at 2021-12-01 15:37

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A153743 Number of elements in wreath product C_4 \u2240 S_n that alternate up/not-up with respect to a weak product ordering.
 * E.g.f.: (6 + 6*sin(x) + 18*x*cos(x) - 9*x^2*sin(x) - x^3*cos(x)) / (6*cos(x) - 18*x*sin(x) - 9*x^2*cos(x) + x^3*sin(x))
 * @author Georg Fischer
 */
public class A153743 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = 0;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN != 0) {
      mF = mF.multiply(mN);
    }
    return RING.series(RING.subtract(RING.subtract(RING.add(RING.add(RING.monomial(Q.SIX, 0), RING.multiply(RING.monomial(Q.SIX, 0), RING.sin(RING.x(), mN), mN)), RING.multiply(RING.monomial(new Q(18), 1), RING.cos(RING.x(), mN), mN)), RING.multiply(RING.monomial(Q.NINE, 2), RING.sin(RING.x(), mN), mN)), RING.multiply(RING.pow(RING.x(), 3, mN), RING.cos(RING.x(), mN), mN)), RING.add(RING.subtract(RING.subtract(RING.multiply(RING.monomial(Q.SIX, 0), RING.cos(RING.x(), mN), mN), RING.multiply(RING.monomial(new Q(18), 1), RING.sin(RING.x(), mN), mN)), RING.multiply(RING.monomial(Q.NINE, 2), RING.cos(RING.x(), mN), mN)), RING.multiply(RING.pow(RING.x(), 3, mN), RING.sin(RING.x(), mN), mN)), mN).coeff(mN).multiply(mF).toZ();
  }
}
