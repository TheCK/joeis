package irvine.oeis.a050;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A050469 a(n) = Sum_{ d divides n, n/d=1 mod 4} d - Sum_{ d divides n, n/d=3 mod 4} d.
 * @author Sean A. Irvine
 */
public class A050469 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z d : Cheetah.factor(++mN).divisors()) {
      final long r = d.mod(4);
      if (r == 1) {
        sum = sum.add(mN / d.longValue());
      } else if (r == 3) {
        sum = sum.subtract(mN / d.longValue());
      }
    }
    return sum;
  }
}
