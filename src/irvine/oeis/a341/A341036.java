package irvine.oeis.a341;
// Generated by gen_seq4.pl sumsi/sumgcd at 2021-11-20 22:12

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A341036 a(n) = Sum_{k=1..n} gcd(k,n)^(k-2).
 * @author Georg Fischer
 */
public class A341036 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 1; k <= mN; ++k) {
      final long gd = LongUtils.gcd(mN, k);
      sum = sum.add(Z.valueOf(gd).pow(k - 2));
    }
    return sum;
  }
}
