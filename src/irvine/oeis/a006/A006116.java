package irvine.oeis.a006;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006116 Sum of Gaussian binomial coefficients [n,k] for q=2 and k=0..n.
 * @author Sean A. Irvine
 */
public class A006116 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k <= mN; ++k) {
      sum = sum.add(Binomial.gaussianBinomial(mN, k, 2));
    }
    return sum;
  }
}
