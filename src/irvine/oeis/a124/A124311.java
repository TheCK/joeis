package irvine.oeis.a124;
// Generated by gen_seq4.pl egfsi at 2021-12-01 15:37

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A124311 a(n) = Sum_{i=0..n} (-2)^i*B(i)*binomial(n,i) where B(n) = Bell numbers A000110(n).
 * E.g.f.: exp(exp(-2*x)-1+x)
 * @author Georg Fischer
 */
public class A124311 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN != 0) {
      mF = mF.multiply(mN);
    }
    return RING.exp(RING.add(RING.subtract(RING.exp(RING.negate(RING.monomial(Q.TWO, 1)), mN), RING.one()), RING.x()), mN).coeff(mN).multiply(mF).toZ();
  }
}
