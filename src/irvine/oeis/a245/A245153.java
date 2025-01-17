package irvine.oeis.a245;
// Generated by gen_seq4.pl egfsi at 2021-12-01 15:37

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A245153 E.g.f.: (cosh(x) + sinh(x)*cosh(3*x)) / sqrt(1 - sinh(x)^2*sinh(3*x)^2).
 * E.g.f.: (cosh(x) + sinh(x)*cosh(3*x)) / sqrt(1 - sinh(x)^2*sinh(3*x)^2)
 * @author Georg Fischer
 */
public class A245153 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN != 0) {
      mF = mF.multiply(mN);
    }
    return RING.series(RING.add(RING.cosh(RING.x(), mN), RING.multiply(RING.sinh(RING.x(), mN), RING.cosh(RING.monomial(Q.THREE, 1), mN), mN)), RING.sqrt(RING.subtract(RING.one(), RING.multiply(RING.pow(RING.sinh(RING.x(), mN), 2, mN), RING.pow(RING.sinh(RING.monomial(Q.THREE, 1), mN), 2, mN), mN)), mN), mN).coeff(mN).multiply(mF).toZ();
  }
}
