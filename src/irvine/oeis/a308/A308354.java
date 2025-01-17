package irvine.oeis.a308;
// Generated by gen_seq4.pl egfsi at 2021-12-01 15:37

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A308354 Number of (2k+1)-ary quasitrivial semigroups that have two neutral elements on an n-element set.
 * E.g.f.: x^2/(3 - 2*exp(x) + x)/2
 * @author Georg Fischer
 */
public class A308354 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = 0;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN != 0) {
      mF = mF.multiply(mN);
    }
    return RING.series(RING.series(RING.pow(RING.x(), 2, mN), RING.add(RING.subtract(RING.monomial(Q.THREE, 0), RING.multiply(RING.monomial(Q.TWO, 0), RING.exp(RING.x(), mN), mN)), RING.x()), mN), RING.monomial(Q.TWO, 0), mN).coeff(mN).multiply(mF).toZ();
  }
}
