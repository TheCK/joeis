package irvine.oeis.a012;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A012696 <code>arctan(tanh(x)*tanh(x))=2/2!*x^2-16/4!*x^4+32/6!*x^6+18944/8!*x^8</code>...
 * @author Sean A. Irvine
 */
public class A012696 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = 0;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    mN += 2;
    mF = mF.multiply(mN).multiply(mN - 1);
    return RING.atan(RING.pow(RING.tanh(RING.x(), mN), 2, mN), mN).coeff(mN).multiply(mF).toZ();
  }
}
