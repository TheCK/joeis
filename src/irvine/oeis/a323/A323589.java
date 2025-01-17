package irvine.oeis.a323;
// Generated by gen_seq4.pl prodsim/prodsi at 2021-11-18 23:07

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A323589 a(n) = Product_{k=1..n-1} (k^k + (n-k)^(n-k)).
 * @author Georg Fischer
 */
public class A323589 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE;
    for (int k = 1; k <= mN - 1; ++k) {
      prod = prod.multiply(Z.valueOf(k).pow(k).add(Z.valueOf(mN - k).pow(mN - k)));
    }
    return prod;
  }
}
