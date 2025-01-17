package irvine.oeis.a321;
// Generated by gen_seq4.pl egfsi at 2021-12-01 15:37

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A321853 a(n) is the sum of the fill times of all 1-dimensional fountains given by the permutations in S_n.
 * E.g.f.: (x + (1-x)*log(1-x))/(1-x)^3
 * @author Georg Fischer
 */
public class A321853 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = 0;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN != 0) {
      mF = mF.multiply(mN);
    }
    return RING.series(RING.add(RING.x(), RING.multiply(RING.oneMinusXToTheN(1), RING.log(RING.oneMinusXToTheN(1), mN), mN)), RING.pow(RING.oneMinusXToTheN(1), 3, mN), mN).coeff(mN).multiply(mF).toZ();
  }
}
