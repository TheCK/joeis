package irvine.oeis.a308;
// Generated by gen_seq4.pl prodsim/prodsid at 2021-11-28 23:01

import irvine.factor.factor.Cheetah;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A308943 a(n) = Product_{d|n} binomial(n,d).
 * @author Georg Fischer
 */
public class A308943 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE;
    for (final Z dd : Cheetah.factor(mN).divisors()) {
      final int d = dd.intValue();
      prod = prod.multiply(Binomial.binomial(mN, d));
    }
    return prod;
  }
}
