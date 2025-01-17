package irvine.oeis.a057;
// Generated by gen_seq4.pl prodsim/prodsif at 2021-11-19 23:43

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A057863 a(n) = Product_{k=1..n} (2k-1)!!.
 * @author Georg Fischer
 */
public class A057863 implements Sequence {

  private static final MemoryFactorial FACTORIAL = MemoryFactorial.SINGLETON;
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE;
    for (int k = 1; k <= mN; ++k) {
      prod = prod.multiply(FACTORIAL.doubleFactorial(2 * k - 1));
    }
    return prod;
  }
}
