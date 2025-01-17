package irvine.oeis.a061;
// Generated by gen_seq4.pl egfsi at 2021-12-01 15:37

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A061123 Number of degree-n permutations of order exactly 9.
 * E.g.f.: -exp(x+1/3*x^3)+exp(x+1/3*x^3+1/9*x^9)
 * @author Georg Fischer
 */
public class A061123 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = 0;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN != 0) {
      mF = mF.multiply(mN);
    }
    return RING.add(RING.negate(RING.exp(RING.add(RING.x(), RING.multiply(RING.series(RING.one(), RING.monomial(Q.THREE, 0), mN), RING.pow(RING.x(), 3, mN), mN)), mN)), RING.exp(RING.add(RING.add(RING.x(), RING.multiply(RING.series(RING.one(), RING.monomial(Q.THREE, 0), mN), RING.pow(RING.x(), 3, mN), mN)), RING.multiply(RING.series(RING.one(), RING.monomial(Q.NINE, 0), mN), RING.pow(RING.x(), 9, mN), mN)), mN)).coeff(mN).multiply(mF).toZ();
  }
}
