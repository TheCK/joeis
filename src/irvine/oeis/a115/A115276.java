package irvine.oeis.a115;
// Generated by gen_seq4.pl egfsi at 2021-12-01 15:37

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A115276 Number of partitions of {1,...,n} into block sizes not a multiple of 4.
 * E.g.f.: exp(sinh(x)+(cosh(x)-cos(x))/2)
 * @author Georg Fischer
 */
public class A115276 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN != 0) {
      mF = mF.multiply(mN);
    }
    return RING.exp(RING.add(RING.sinh(RING.x(), mN), RING.series(RING.subtract(RING.cosh(RING.x(), mN), RING.cos(RING.x(), mN)), RING.monomial(Q.TWO, 0), mN)), mN).coeff(mN).multiply(mF).toZ();
  }
}
