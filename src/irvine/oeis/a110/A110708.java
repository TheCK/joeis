package irvine.oeis.a110;
// Generated by gen_seq4.pl egfsi at 2021-12-01 15:37

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A110708 E.g.f. log(1+arctan(x)).
 * E.g.f.: log(1+arctan(x))
 * @author Georg Fischer
 */
public class A110708 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN != 0) {
      mF = mF.multiply(mN);
    }
    return RING.log(RING.add(RING.one(), RING.atan(RING.x(), mN)), mN).coeff(mN).multiply(mF).toZ();
  }
}
