package irvine.oeis.a325;
// Generated by gen_seq4.pl prodsim/prodsid at 2021-11-28 23:01

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A325030 a(n) = Product_{d|n} (sigma(d)*pod(d)) where sigma(k) = the sum of the divisors of k (A000203) and pod(k) = the product of the divisors of k (A007955).
 * @author Georg Fischer
 */
public class A325030 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE;
    for (final Z dd : Cheetah.factor(mN).divisors()) {
      final int d = dd.intValue();
      prod = prod.multiply(Cheetah.factor(dd).sigma().multiply(Cheetah.factor(dd).pod()));
    }
    return prod;
  }
}
