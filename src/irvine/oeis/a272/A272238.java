package irvine.oeis.a272;
// Generated by gen_seq4.pl prodsim/prodsif at 2021-11-18 23:07

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A272238 a(n) = Product_{k=0..n} (n^2+k)!.
 * @author Georg Fischer
 */
public class A272238 implements Sequence {

  private static final MemoryFactorial FACTORIAL = MemoryFactorial.SINGLETON;
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE;
    for (int k = 0; k <= mN; ++k) {
      prod = prod.multiply(FACTORIAL.factorial(mN * mN + k));
    }
    return prod;
  }
}
