package irvine.oeis.a341;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000203;
import irvine.oeis.a003.A003961;

/**
 * A341529 a(n) = sigma(n) * A003961(n), where A003961 shifts the prime factorization of n one step towards larger primes, and sigma is the sum of the divisors of n.
 * @author Georg Fischer
 */
public class A341529 implements Sequence {

  final Sequence mA000203 = new A000203();
  final Sequence mA003961 = new A003961();
  @Override
  public Z next() {
    return mA000203.next().multiply(mA003961.next());
  }

}
