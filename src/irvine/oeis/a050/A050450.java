package irvine.oeis.a050;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A050450 Sum_{d|n, d=1 mod 4} d^2.
 * @author Sean A. Irvine
 */
public class A050450 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z d : Cheetah.factor(++mN).divisors()) {
      if (d.mod(4) == 1) {
        sum = sum.add(d.square());
      }
    }
    return sum;
  }
}
