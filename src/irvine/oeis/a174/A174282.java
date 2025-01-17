package irvine.oeis.a174;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000244;
import irvine.oeis.a014.A014963;

/**
 * A174282 a(n) = 3^n mod M(n) where M(n) = A014963(n) is the exponential of the Mangoldt function.
 * @author Georg Fischer
 */
public class A174282 implements Sequence {

  final Sequence mA000244 = new A000244();
  final Sequence mA014963 = new A014963();
  @Override
  public Z next() {
    return mA000244.next().mod(mA014963.next());
  }

}
