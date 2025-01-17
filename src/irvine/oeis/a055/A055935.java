package irvine.oeis.a055;

import irvine.math.IntegerUtils;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A055935 a(0)=1; a(n) = Sum_{j&lt;n, gcd(n,a(j)) = 1} a(j).
 * @author Sean A. Irvine
 */
public class A055935 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n <= 1) {
      return Z.ONE;
    } else if ((n & 1) == 0) {
      return Z.TWO;
    }
    Z sum = Z.ZERO;
    for (final Z a : this) {
      if (IntegerUtils.gcd(n, a.intValueExact()) == 1) {
        sum = sum.add(a);
      }
    }
    return sum;
  }
}
