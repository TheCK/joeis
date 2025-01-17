package irvine.oeis.a084;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.BellNumbers;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A084357 Number of sets of sets of lists.
 * Sum_{k=0..n} n!/k!*binomial(n-1, k-1)*Bell(k).
 *
 * @author Georg Fischer
 */
public class A084357 implements Sequence {

  private static final MemoryFactorial FACTORIAL = MemoryFactorial.SINGLETON;
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    if (mN == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int k = 0; k <= mN; ++k) {
      sum = sum.add(FACTORIAL.factorial(mN)
        .multiply(Binomial.binomial(mN - 1, k - 1))
        .multiply(BellNumbers.bell(k))
        .divide(FACTORIAL.factorial(k))
      );
    }
    return sum;
  }
}
