package irvine.oeis.a052;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A052772 Number of rooted identity trees with n nodes and 4-colored non-root nodes.
 * @author Sean A. Irvine
 */
public class A052772 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Q FOUR = Q.FOUR;
  private int mN = -1;
  private Polynomial<Q> mA = RING.zero();

  @Override
  public Z next() {
    if (++mN > 0) {
      Polynomial<Q> sum = RING.zero();
      for (int k = 1; k <= mN; ++k) {
        sum = RING.signedAdd((k & 1) == 1, sum, RING.divide(mA.substitutePower(k, mN), new Q(k)));
      }
      mA = RING.exp(RING.multiply(sum, FOUR), mN).shift(1);
    }
    return mA.coeff(mN).toZ();
  }
}
