package irvine.oeis.a279;
// Generated by gen_seq4.pl egfsi at 2021-12-01 20:53

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A279642 Exponential transform of the ninth powers A001017.
 * E.g.f.: exp(exp(x)*(x^9+36*x^8+462*x^7+2646*x^6+6951*x^5+7770*x^4 +3025*x^3 +255*x^2+x))
 * @author Georg Fischer
 */
public class A279642 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN != 0) {
      mF = mF.multiply(mN);
    }
    return RING.exp(RING.multiply(RING.exp(RING.x(), mN), RING.add(RING.add(RING.add(RING.add(RING.add(RING.add(RING.add(RING.add(RING.pow(RING.x(), 9, mN), RING.monomial(new Q(36), 8)), RING.monomial(new Q(462), 7)), RING.monomial(new Q(2646), 6)), RING.monomial(new Q(6951), 5)), RING.monomial(new Q(7770), 4)), RING.monomial(new Q(3025), 3)), RING.monomial(new Q(255), 2)), RING.x()), mN), mN).coeff(mN).multiply(mF).toZ();
  }
}
