package irvine.oeis.a347;
// Generated by gen_seq4.pl egfsi at 2021-12-01 15:37

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A347512 Number of minimal dominating sets in the n-book graph.
 * E.g.f.: exp(x)*(3 + exp(x)) - 4 + x
 * @author Georg Fischer
 */
public class A347512 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = 0;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN != 0) {
      mF = mF.multiply(mN);
    }
    return RING.add(RING.subtract(RING.multiply(RING.exp(RING.x(), mN), RING.add(RING.monomial(Q.THREE, 0), RING.exp(RING.x(), mN)), mN), RING.monomial(Q.FOUR, 0)), RING.x()).coeff(mN).multiply(mF).toZ();
  }
}
