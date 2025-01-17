package irvine.oeis.a118;
// manually prodsim at 2021-11-19 23:05

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence;
import irvine.oeis.a007.A007918;

/**
 * A118456 a(n) = Product_{k=1..n} P(k), where P(k) is the smallest prime &gt;= k.
 * @author Georg Fischer
 */
public class A118456 implements Sequence {

  private int mN = 0;
  private MemorySequence mSeq = MemorySequence.cachedSequence(new A007918());

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE;
    for (int k = 1; k <= mN; ++k) {
      prod = prod.multiply(mSeq.a(k));
    }
    return prod;
  }
}
