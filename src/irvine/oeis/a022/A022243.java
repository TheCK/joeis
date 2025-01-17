package irvine.oeis.a022;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A022243 Gaussian binomial coefficients [ n,3 ] for q = 8.
 * @author Sean A. Irvine
 */
public class A022243 implements Sequence {

  private int mN = 2;

  @Override
  public Z next() {
    return Binomial.gaussianBinomial(++mN, 3, 8);
  }
}
