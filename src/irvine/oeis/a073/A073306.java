package irvine.oeis.a073;
// Generated by gen_seq4.pl prodsi2/prodsib at 2021-11-20 22:11

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A073306 a(n) = Product_{2i&lt;n} binomial(2*n-2*i-1, 2*i).
 * @author Georg Fischer
 */
public class A073306 implements Sequence {

  private static final MemoryFactorial FACTORIAL = MemoryFactorial.SINGLETON;
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE;
    for (int i = 1; i <= (mN - 1) / 2; ++i) {
      prod = prod.multiply(Binomial.binomial(2 * mN - 2 * i - 1, 2 * i));
    }
    return prod;
  }
}
