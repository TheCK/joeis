package irvine.oeis.a022;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A022193 Gaussian binomial coefficients [ n,10 ] for q = 2.
 * @author Sean A. Irvine
 */
public class A022193 implements Sequence {

  private int mN = 9;

  @Override
  public Z next() {
    return Binomial.gaussianBinomial(++mN, 10, 2);
  }
}
