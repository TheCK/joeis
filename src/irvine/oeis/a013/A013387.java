package irvine.oeis.a013;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013387 sech(sin(x)-tanh(x))=1-10/6!*x^6+840/8!*x^8-60870/10!*x^10...
 * @author Sean A. Irvine
 */
public class A013387 implements Sequence {

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
    return RING.sech(RING.subtract(RING.sin(RING.x(), mN), RING.tanh(RING.x(), mN)), mN).coeff(mN).multiply(mF).toZ();
  }
}
