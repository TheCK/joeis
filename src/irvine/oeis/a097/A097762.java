package irvine.oeis.a097;
// Generated by gen_seq4.pl egfsi at 2021-12-01 15:37

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A097762 Number of different partitions of the set {1, 2, ..., n} into an odd number of blocks such that each block contains at least 2 elements.
 * E.g.f.: sinh(exp(x)-x-1)
 * @author Georg Fischer
 */
public class A097762 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = 0;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN != 0) {
      mF = mF.multiply(mN);
    }
    return RING.sinh(RING.subtract(RING.subtract(RING.exp(RING.x(), mN), RING.x()), RING.one()), mN).coeff(mN).multiply(mF).toZ();
  }
}
