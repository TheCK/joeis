package irvine.oeis.a203;
// manually prodsi2 at 2021-11-24

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000045;

/**
 * A203311 Vandermonde determinant of (1,2,3,...,F(n+1)), where F=A000045 (Fibonacci numbers).
 * @author Georg Fischer
 */
public class A203311 implements Sequence {

  private int mN = 0;
  private final MemorySequence mA000045 = MemorySequence.cachedSequence(new SkipSequence(new A000045(), 1));

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE;
    for (int k = 2; k <= mN; ++k) {
      for (int j = 1; j <= k - 1; ++j) {
        final Z diff = mA000045.a(k).subtract(mA000045.a(j));
        if (!diff.isZero()) {
          prod = prod.multiply(diff);
        }
      }
    }
    return prod;
  }
}
