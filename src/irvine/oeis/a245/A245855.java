package irvine.oeis.a245;
// Generated by gen_seq4.pl egfsi at 2021-12-01 15:37

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A245855 Number of preferential arrangements of n labeled elements such that the minimal number of elements per rank equals 2.
 * E.g.f.: 1/(2-exp(x)+x) -1/(2-exp(x)+x+x^2/2)
 * @author Georg Fischer
 */
public class A245855 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = 1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN != 0) {
      mF = mF.multiply(mN);
    }
    return RING.subtract(RING.series(RING.one(), RING.add(RING.subtract(RING.monomial(Q.TWO, 0), RING.exp(RING.x(), mN)), RING.x()), mN), RING.series(RING.one(), RING.add(RING.add(RING.subtract(RING.monomial(Q.TWO, 0), RING.exp(RING.x(), mN)), RING.x()), RING.series(RING.pow(RING.x(), 2, mN), RING.monomial(Q.TWO, 0), mN)), mN)).coeff(mN).multiply(mF).toZ();
  }
}
