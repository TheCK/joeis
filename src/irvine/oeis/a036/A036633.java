package irvine.oeis.a036;

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A036633 Number of 4-ary rooted trees with n nodes and height exactly 9.
 * @author Sean A. Irvine
 */
public class A036633 extends A036606 {

  private final Polynomial<Q> mB;
  {
    for (int k = 0; k <= 8; ++k) {
      step();
    }
    mB = mA;
    step();
  }

  @Override
  public Z next() {
    return mM >= mA.degree() ? null : mA.coeff(mM).subtract(mB.coeff(mM++)).toZ();
  }
}
