package irvine.oeis.a036;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A036280 Numerators in Taylor series for x * cosec(x).
 * @author Sean A. Irvine
 */
public class A036280 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<Q>(Rationals.SINGLETON);
  private int mN = -2;

  @Override
  public Z next() {
    mN += 2;
    return RING.xcsc(RING.x(), mN).coeff(mN).num();
  }
}

