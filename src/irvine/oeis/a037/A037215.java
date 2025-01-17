package irvine.oeis.a037;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A037215 Expansion of ( Sum_{k&gt;=0} k*q^(k^2) )^3.
 * @author Sean A. Irvine
 */
public class A037215 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long x = 1; x * x <= mN; ++x) {
      final long r = mN - x * x;
      for (long y = 1; y * y <= r; ++y) {
        final long s = r - y * y;
        final long z = LongUtils.sqrt(s);
        if (z * z == s) {
          sum = sum.add(z * y * x);
        }
      }
    }
    return sum;
  }
}
