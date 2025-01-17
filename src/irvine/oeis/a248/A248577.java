package irvine.oeis.a248;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000005;
import irvine.oeis.a001.A001221;

/**
 * A248577 Product of the number of divisors of n and the number of distinct prime divisors of n; i.e., tau(n) * omega(n).
 * @author Georg Fischer
 */
public class A248577 implements Sequence {

  final Sequence mA000005 = new A000005();
  final Sequence mA001221 = new A001221();
  @Override
  public Z next() {
    return mA000005.next().multiply(mA001221.next());
  }

}
