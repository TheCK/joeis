package irvine.oeis.a050;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A050358 Number of ordered factorizations of n with 3 levels of parentheses.
 * @author Sean A. Irvine
 */
public class A050358 extends MemorySequence {

  {
    add(Z.ZERO);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 1) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (final Z dd : Cheetah.factor(n).divisors()) {
      final int d = dd.intValue();
      if (d < n) {
        sum = sum.add(get(d));
      }
    }
    return sum.multiply(4);
  }

  @Override
  public Z next() {
    return super.next().divide(4).max(Z.ONE);
  }
}
