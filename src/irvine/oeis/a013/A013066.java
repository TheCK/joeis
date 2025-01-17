package irvine.oeis.a013;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013066 sec(sinh(x)+arctan(x)) = 1 + 4/2!*x^2 + 72/4!*x^4 + 3414/6!*x^6 + 293944/8!*x^8 + ...
 * @author Sean A. Irvine
 */
public class A013066 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -2;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    mN += 2;
    if (mN == 0) {
      return Z.ONE;
    }
    mF = mF.multiply(mN).multiply(mN - 1);
    return RING.sec(RING.add(RING.sinh(RING.x(), mN), RING.atan(RING.x(), mN)), mN).coeff(mN).multiply(mF).toZ();
  }
}
