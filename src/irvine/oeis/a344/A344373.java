package irvine.oeis.a344;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A344373 a(n) = Sum_{k=1..n-1} (-1)^k gcd(k, n).
 * @author Georg Fischer
 */
public class A344373 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = mN - 1; k >= 1; --k) {
      final long gd = LongUtils.gcd(k, mN);
      sum = sum.add(((k & 1) == 0) ? gd : -gd);
    }
    return sum;
  }
}
