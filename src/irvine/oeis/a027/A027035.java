package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027035 a(n) = Sum_{k=0..n} T(n,n+k), T given by A027023.
 * @author Sean A. Irvine
 */
public class A027035 extends A027023 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = mN; k <= 2 * mN; ++k) {
      sum = sum.add(get(mN, k));
    }
    return sum;
  }
}
