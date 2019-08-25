package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A025273 <code>a(n) = a(1)*a(n-1) + a(2)*a(n-2) + ...+ a(n-1)*a(1)</code> for <code>n &gt;= 5</code>.
 * @author Sean A. Irvine
 */
public class A025273 extends MemorySequence {

  {
    add(null); // 0th
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n <= 4) {
      return n == 2 ? Z.ZERO : Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int k = 1; k < n; ++k) {
      sum = sum.add(get(k).multiply(get(n - k)));
    }
    return sum;
  }
}