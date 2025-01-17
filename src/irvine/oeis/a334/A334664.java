package irvine.oeis.a334;
// Generated by gen_seq4.pl prodsim/prodsid at 2021-11-28 23:01

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A334664 a(n) = Product_{d|n} gcd(d, tau(d)).
 * @author Georg Fischer
 */
public class A334664 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE;
    for (final Z dd : Cheetah.factor(mN).divisors()) {
      final int d = dd.intValue();
      prod = prod.multiply(Cheetah.factor(dd).sigma0().gcd(dd));
    }
    return prod;
  }
}
