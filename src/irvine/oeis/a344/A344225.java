package irvine.oeis.a344;
// Generated by gen_seq4.pl sumsi/sumgcd at 2021-11-20 22:12

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A344225 a(n) = Sum_{k=1..n} tau(gcd(k,n)^(n/gcd(k,n))), where tau(n) is the number of divisors of n.
 * @author Georg Fischer
 */
public class A344225 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 1; k <= mN; ++k) {
      final long gd = LongUtils.gcd(mN, k);
      sum = sum.add(irvine.factor.factor.Cheetah.factor(Z.valueOf(gd).pow(mN / gd)).sigma0());
    }
    return sum;
  }
}
