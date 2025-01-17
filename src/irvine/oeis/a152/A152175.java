package irvine.oeis.a152;

import irvine.factor.factor.Cheetah;
import irvine.math.MemoryFunctionInt3;
import irvine.math.z.Euler;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A152175 Triangle read by rows: T(n,k) is the number of k-block partitions of an n-set up to rotations.
 * @author Sean A. Irvine
 */
public class A152175 extends MemoryFunctionInt3<Z> implements Sequence {

  private int mN = 0;
  private int mM = 0;

  @Override
  protected Z compute(final int d, final int n, final int k) {
    if (n == 0 || k == 0) {
      return n == k ? Z.ONE : Z.ZERO;
    }
    return get(d, n - 1, k).multiply(k).add(Integers.SINGLETON.sumdiv(d, j -> get(d, n - 1, k - j)));
  }

  protected Z t(final int n, final int k) {
    Z sum = Z.ZERO;
    for (final Z dd : Cheetah.factor(n).divisors()) {
      final int d = dd.intValue();
      sum = sum.add(Euler.phi(dd).multiply(get(d, n / d, k)));
    }
    return sum.divide(n);
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return t(mN, mM);
  }
}
