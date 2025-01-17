package irvine.oeis.a269;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000040;

/**
 * A269327 a(n) = 7^prime(n).
 * @author Georg Fischer
 */
public class A269327 implements Sequence {

  final Sequence mA000040 = new A000040();
  @Override
  public Z next() {
    return Z.SEVEN.pow(mA000040.next());
  }

}
