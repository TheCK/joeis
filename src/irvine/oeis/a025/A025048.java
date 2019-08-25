package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.a059.A059882;

/**
 * A025048 Ascending wiggly sums: number of sums adding to n in which terms alternately increase and decrease.
 * @author Sean A. Irvine
 */
public class A025048 extends A059882 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 1; k <= mN; ++k) {
      sum = sum.add(mT.get(mN, k));
    }
    return sum;
  }
}