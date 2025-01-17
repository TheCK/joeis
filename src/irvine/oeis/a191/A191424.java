package irvine.oeis.a191;
// Generated by gen_seq4.pl egfsi at 2021-12-01 15:37

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A191424 E.g.f. exp(exp(1/2*x^2+1/6*x^3)-1).
 * E.g.f.: exp(exp(1/2*x^2+1/6*x^3)-1)
 * @author Georg Fischer
 */
public class A191424 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN != 0) {
      mF = mF.multiply(mN);
    }
    return RING.exp(RING.subtract(RING.exp(RING.add(RING.multiply(RING.series(RING.one(), RING.monomial(Q.TWO, 0), mN), RING.pow(RING.x(), 2, mN), mN), RING.multiply(RING.series(RING.one(), RING.monomial(Q.SIX, 0), mN), RING.pow(RING.x(), 3, mN), mN)), mN), RING.one()), mN).coeff(mN).multiply(mF).toZ();
  }
}
