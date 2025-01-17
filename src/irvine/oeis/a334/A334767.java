package irvine.oeis.a334;
// Generated by gen_seq4.pl prodsim/prodsi at 2021-11-28 23:01

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A334767 a(n) = Product_{k=1..n} d(2*k), where d() is the number of divisors function A000005.
 * @author Georg Fischer
 */
public class A334767 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE;
    for (int k = 1; k <= mN; ++k) {
      prod = prod.multiply(irvine.factor.factor.Cheetah.factor(2 * k).sigma0());
    }
    return prod;
  }
}
