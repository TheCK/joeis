package irvine.oeis.a052;

import irvine.math.z.Binomial;
import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A052895 E.g.f.: (1/2)/(exp(x) - 1) * (1 - (5 - 4*exp(x))^(1/2)).
 * @author Sean A. Irvine
 */
public class A052895 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    Z kf = Z.ONE;
    for (int k = 0; k <= mN; ++k) {
      if (k > 1) {
        kf = kf.multiply(k);
      }
      sum = sum.add(Stirling.secondKind(mN, k).multiply(Binomial.catalan(k)).multiply(kf));
    }
    return sum;
  }
}

