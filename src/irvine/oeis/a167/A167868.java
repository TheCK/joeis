package irvine.oeis.a167;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A167868 <code>a(n) =</code> 3^n*Sum_{ <code>k=0..n } binomial(2*k</code>,k)^3/3^k.
 * @author Sean A. Irvine
 */
public class A167868 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k < mN; ++k) {
      sum = sum.add(Binomial.binomial(2 * k, k).pow(3).multiply(Z.THREE.pow(mN - k - 1)));
    }
    return sum;
  }
}

