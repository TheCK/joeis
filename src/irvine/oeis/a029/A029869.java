package irvine.oeis.a029;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.a000.A000081;

/**
 * A029869 Number of connected functions on n points with a loop of length 6.
 * @author Sean A. Irvine
 */
public class A029869 extends A000081 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private int mN = -1;
  private final Polynomial<Z> mB = RING.empty();
  {
    next();
    next();
    next();
    next();
    next();
    next();
  }

  @Override
  public Z next() {
    mB.add(super.next());
    return RING.pow(mB, 6, ++mN).coeff(mN)
      .add(RING.pow(mB.substitutePower(2, mN), 3).coeff(mN))
      .add(RING.pow(mB.substitutePower(3, mN), 2).coeff(mN).multiply2())
      .add(mB.substitutePower(6, mN).coeff(mN).multiply2())
      .divide(6);
  }
}
