package irvine.oeis.a013;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013524 Numerator of <code>[x^(2n+1)]</code> of the Taylor expansion <code>tanh(cosec(x) - cot(x))</code>.
 * @author Sean A. Irvine
 */
public class A013524 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> X2 = RING.multiply(RING.x(), Q.HALF);
  private int mN = -1;

  @Override
  public Z next() {
    mN += 2;
    return RING.tanh(RING.tan(X2, mN), mN).coeff(mN).num();
  }
}
