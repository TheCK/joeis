package irvine.oeis.a013;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013388 exp(sin(x)-arctanh(x))=1-3/3!*x^3-23/5!*x^5+90/6!*x^6-721/7!*x^7...
 * @author Sean A. Irvine
 */
public class A013388 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    mF = mF.multiply(mN);
    return RING.exp(RING.subtract(RING.sin(RING.x(), mN), RING.atanh(RING.x(), mN)), mN).coeff(mN).multiply(mF).toZ();
  }
}
