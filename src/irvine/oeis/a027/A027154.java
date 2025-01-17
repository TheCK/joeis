package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027154 a(n) = Sum_{k=0..floor(n/2)} A027144(n-k, k).
 * @author Sean A. Irvine
 */
public class A027154 extends A027144 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k <= mN / 2; ++k) {
      sum = sum.add(get(mN - k, k));
    }
    return sum;
  }
}
