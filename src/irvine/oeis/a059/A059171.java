package irvine.oeis.a059;
// Generated by gen_seq4.pl egfsi at 2021-12-01 15:37

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A059171 Size of largest conjugacy class in S_n, the symmetric group on n symbols.
 * E.g.f.: x - x^2/2 - x*log(1-x)
 * @author Georg Fischer
 */
public class A059171 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = 0;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN != 0) {
      mF = mF.multiply(mN);
    }
    return RING.subtract(RING.subtract(RING.x(), RING.series(RING.pow(RING.x(), 2, mN), RING.monomial(Q.TWO, 0), mN)), RING.multiply(RING.x(), RING.log(RING.oneMinusXToTheN(1), mN), mN)).coeff(mN).multiply(mF).toZ();
  }
}
