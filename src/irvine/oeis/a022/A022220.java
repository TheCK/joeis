package irvine.oeis.a022;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A022220 Gaussian binomial coefficients [ n,2 ] for q = 6.
 * @author Sean A. Irvine
 */
public class A022220 implements Sequence {

  private int mN = 1;

  @Override
  public Z next() {
    return Binomial.gaussianBinomial(++mN, 2, 6);
  }
}
