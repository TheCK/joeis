package irvine.oeis.a308;
// Generated by gen_seq4.pl egfsi at 2021-12-01 15:37

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A308519 Expansion of e.g.f. exp(exp(1 - exp(x)) - 1).
 * E.g.f.: exp(exp(1 - exp(x)) - 1)
 * @author Georg Fischer
 */
public class A308519 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN != 0) {
      mF = mF.multiply(mN);
    }
    return RING.exp(RING.subtract(RING.exp(RING.subtract(RING.one(), RING.exp(RING.x(), mN)), mN), RING.one()), mN).coeff(mN).multiply(mF).toZ();
  }
}
