package irvine.oeis.a022;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A022256 Gaussian binomial coefficients [ n,5 ] for q = 9.
 * @author Sean A. Irvine
 */
public class A022256 implements Sequence {

  private int mN = 4;

  @Override
  public Z next() {
    return Binomial.gaussianBinomial(++mN, 5, 9);
  }
}
