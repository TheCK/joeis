package irvine.oeis.a050;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A050471 a(n) = sum_{d|n, n/d=1 mod 4} d^3 - sum_{d|n, n/d=3 mod 4} d^3.
 * @author Sean A. Irvine
 */
public class A050471 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z d : Cheetah.factor(++mN).divisors()) {
      final long r = d.mod(4);
      if (r == 1) {
        sum = sum.add(Z.valueOf(mN / d.longValue()).pow(3));
      } else if (r == 3) {
        sum = sum.subtract(Z.valueOf(mN / d.longValue()).pow(3));
      }
    }
    return sum;
  }
}
