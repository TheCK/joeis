package irvine.oeis.a006;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000081;

/**
 * A006871 Exponentiation of g.f. for rooted trees.
 * @author Sean A. Irvine
 */
public class A006871 extends MemorySequence {

  private final MemorySequence mRootedTrees = MemorySequence.cachedSequence(new SkipSequence(new A000081(), 1));
  private int mN = -1;
  {
    add(Z.ONE);
  }

  @Override
  public Z computeNext() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k <= mN; ++k) {
      sum = sum.add(Binomial.binomial(mN, k).multiply(mRootedTrees.a(k)).multiply(get(mN - k)));
    }
    return sum;
  }
}
