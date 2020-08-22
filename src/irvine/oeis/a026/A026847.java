package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026847 a(n) = T(n,m) + T(n,m+1) + ... + T(n,n), where m=[ (n+1)/2 ], T given by A026725.
 * @author Sean A. Irvine
 */
public class A026847 extends A026725 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = (mN + 1) / 2; k <= mN; ++k) {
      sum = sum.add(get(mN, k));
    }
    return sum;
  }
}
