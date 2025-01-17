package irvine.oeis.a011;

import java.util.Collections;
import java.util.HashSet;

import irvine.factor.factor.Cheetah;
import irvine.math.Mobius;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A011793 Triangle of numbers of irreducible Euler sums.
 * @author Sean A. Irvine
 */
public class A011793 implements Sequence {

  private long mN = 0;
  private long mM = 0;

  private Z t(final long n, final long k) {
    if (n <= 3) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    final HashSet<Z> divisors = new HashSet<>();
    Collections.addAll(divisors, Cheetah.factor(mN - k).divisors());
    for (final Z d : Cheetah.factor(mN + k).divisors()) {
      if (d.isEven() && divisors.contains(d)) {
        final long dd = d.longValue();
        sum = sum.add(Binomial.binomial((n + k) / dd, (n - k) / dd).multiply(Mobius.mobius(dd / 2)));
      }
    }
    return sum.multiply2().divide(n + k);
  }

  @Override
  public Z next() {
    mM += 2;
    if (mM >= mN) {
      ++mN;
      mM = 2 - (mN & 1);
    }
    return t(mN, mM);
  }
}
