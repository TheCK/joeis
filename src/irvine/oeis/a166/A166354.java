package irvine.oeis.a166;
// Generated by gen_seq4.pl egfsi at 2021-12-01 15:37

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A166354 Row sums of exponential Riordan array [1+x*tan(x/2),x], A166353.
 * E.g.f.: exp(x)*(1+x*tan(x/2))
 * @author Georg Fischer
 */
public class A166354 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN != 0) {
      mF = mF.multiply(mN);
    }
    return RING.multiply(RING.exp(RING.x(), mN), RING.add(RING.one(), RING.multiply(RING.x(), RING.tan(RING.series(RING.x(), RING.monomial(Q.TWO, 0), mN), mN), mN)), mN).coeff(mN).multiply(mF).toZ();
  }
}
