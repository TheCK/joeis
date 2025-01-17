package irvine.oeis.a260;
// Generated by gen_seq4.pl prodsim/prodsi at 2021-11-18 23:07

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A260231 a(n) = Product_{k=1..n} (1 + k^k).
 * @author Georg Fischer
 */
public class A260231 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE;
    for (int k = 1; k <= mN; ++k) {
      prod = prod.multiply(Z.valueOf(k).pow(k).add(1));
    }
    return prod;
  }
}
