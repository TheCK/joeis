package irvine.oeis.a096;
// Generated by gen_seq4.pl egfsi at 2021-12-01 15:37

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A096647 Number of partitions of an n-set with even number of even blocks.
 * E.g.f.: exp(sinh(x))*cosh(cosh(x)-1)
 * @author Georg Fischer
 */
public class A096647 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN != 0) {
      mF = mF.multiply(mN);
    }
    return RING.multiply(RING.exp(RING.sinh(RING.x(), mN), mN), RING.cosh(RING.subtract(RING.cosh(RING.x(), mN), RING.one()), mN), mN).coeff(mN).multiply(mF).toZ();
  }
}
