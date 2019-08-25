package irvine.oeis.a024;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024998 <code>a(n) =</code> number of <code>(s(0), s(1)</code>, ..., <code>s(n))</code> such that every <code>s(i)</code> is an integer, <code>s(0) = 0, |s(i) - s(i-1)| = 1</code> for i <code>= 1,2; |s(i) - s(i-1)| &lt;= 1</code> for i <code>&gt;= 3, s(n) = 1</code>. Also <code>a(n) = T(n,n-1)</code>, where T is the array defined in <code>A024996</code>.
 * @author Sean A. Irvine
 */
public class A024998 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (long k = 1; k <= mN / 2; ++k) {
      sum = sum.add(Binomial.binomial(mN - 1, 2 * k - 1).multiply(Binomial.binomial(2 * k + 1, k)));
    }
    return sum;
  }
}