package irvine.oeis.a123;
// Generated by gen_seq4.pl egfsi at 2021-12-01 20:53

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A123897 Expansion of e.g.f.: exp(2*(exp(exp(x)-1)-1)/(2-exp(exp(x)-1))).
 * E.g.f.: exp(2*(exp(exp(x)-1)-1)/(2-exp(exp(x)-1)))
 * @author Georg Fischer
 */
public class A123897 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN != 0) {
      mF = mF.multiply(mN);
    }
    return RING.exp(RING.series(RING.multiply(RING.monomial(Q.TWO, 0), RING.subtract(RING.exp(RING.subtract(RING.exp(RING.x(), mN), RING.one()), mN), RING.one()), mN), RING.subtract(RING.monomial(Q.TWO, 0), RING.exp(RING.subtract(RING.exp(RING.x(), mN), RING.one()), mN)), mN), mN).coeff(mN).multiply(mF).toZ();
  }
}
