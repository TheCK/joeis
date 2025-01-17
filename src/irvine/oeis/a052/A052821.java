package irvine.oeis.a052;

import irvine.math.LongUtils;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A052821 A simple grammar: pairs of cycles of sequences.
 * @author Sean A. Irvine
 */
public class A052821 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Polynomial<Q> sum = RING.zero();
    for (int j = 1; j <= mN; ++j) {
      sum = RING.add(sum, RING.multiply(RING.log(RING.series(RING.oneMinusXToTheN(j), RING.oneMinusXToTheN(Q.TWO, j), mN), mN), new Q(LongUtils.phi(j), j)));
    }
    return RING.pow(sum, 2, mN).coeff(mN).toZ();
  }
}
