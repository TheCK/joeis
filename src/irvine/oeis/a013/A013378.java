package irvine.oeis.a013;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013378 cos(sin(x)-arcsinh(x))=1-8064/10!*x^10+1419264/12!*x^12...
 * @author Sean A. Irvine
 */
public class A013378 implements Sequence {

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
    return RING.cos(RING.subtract(RING.sin(RING.x(), mN), RING.asinh(RING.x(), mN)), mN).coeff(mN).multiply(mF).toZ();
  }
}
