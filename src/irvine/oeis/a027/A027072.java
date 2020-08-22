package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027072 a(n) = self-convolution of row n of array T given by A027052.
 * @author Sean A. Irvine
 */
public class A027072 extends A027052 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k <= 2 * mN; ++k) {
      sum = sum.add(get(mN, k).multiply(get(mN, 2 * mN - k)));
    }
    return sum;
  }
}
