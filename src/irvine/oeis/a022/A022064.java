package irvine.oeis.a022;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.ThetaFunctions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A022064 Theta series of D*_11 lattice.
 * @author Sean A. Irvine
 */
public class A022064 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return RING.pow(ThetaFunctions.theta3z(mN / 4), 11, mN / 4).substitutePower(4, mN).coeff(mN)
      .add(RING.pow(ThetaFunctions.theta2(mN / 4).substitutePower(4).toPolynomial(), 11, mN).coeff(mN));
  }
}
