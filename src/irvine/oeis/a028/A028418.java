package irvine.oeis.a028;

import irvine.math.MemoryFunction2;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A028418 Sum over all n! permutations of n letters of maximum cycle length.
 * @author Sean A. Irvine
 */
public class A028418 extends MemoryFunction2<Long, Z> implements Sequence {

  private long mN = 0;

  @Override
  protected Z compute(final Long n, final Long m) {
    if (n == 0) {
      return Z.valueOf(m);
    }
    Z sum = Z.ZERO;
    Z f = Z.ONE;
    for (long j = 1; j <= n; ++j) {
      sum = sum.add(get(n - j, Math.max(m, j)).multiply(Binomial.binomial(n - 1, j - 1)).multiply(f));
      f = f.multiply(j);
    }
    return sum;
  }

  @Override
  public Z next() {
    return get(++mN, 0L);
  }
}
