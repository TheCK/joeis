package irvine.oeis.a324;
// Generated by gen_seq4.pl prodsim/prodsid at 2021-11-28 23:01

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A324987 a(n) = Product_{d|n} (tau(d)*sigma(d)) where tau(k) = the number of divisors of k (A000005) and sigma(k) = the sum of the divisors of k (A000203).
 * @author Georg Fischer
 */
public class A324987 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE;
    for (final Z dd : Cheetah.factor(mN).divisors()) {
      final int d = dd.intValue();
      prod = prod.multiply(Cheetah.factor(dd).sigma0().multiply(Cheetah.factor(dd).sigma()));
    }
    return prod;
  }
}
