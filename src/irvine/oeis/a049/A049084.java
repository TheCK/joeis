package irvine.oeis.a049;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000720;
import irvine.oeis.a010.A010051;

/**
 * A049084 a(n) = pi(n) if n is prime, otherwise 0.
 * @author Georg Fischer
 */
public class A049084 implements Sequence {

  final Sequence mA000720 = new A000720();
  final Sequence mA010051 = new A010051();
  @Override
  public Z next() {
    return mA000720.next().multiply(mA010051.next());
  }

}
