package irvine.oeis.a050;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000045;

/**
 * A050946 "Stirling-Bernoulli transform" of Fibonacci numbers.
 * @author Sean A. Irvine
 */
public class A050946 implements Sequence {

  private final MemorySequence mFibo = MemorySequence.cachedSequence(new A000045());
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    Z f = Z.ONE;
    for (int k = 1 ; k <= mN; ++k, f = f.multiply(k)) {
      sum = sum.signedAdd(((mN - k) & 1) == 0, Stirling.secondKind(mN, k).multiply(f).multiply(mFibo.a(k)));
    }
    return sum;
  }
}
