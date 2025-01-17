package irvine.oeis.a248;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000079;
import irvine.oeis.a002.A002618;

/**
 * A248643 a(n) = phi(2^n) - phi(n^2), with Euler's totient function phi = A000010.
 * @author Georg Fischer
 */
public class A248643 implements Sequence {

  final Sequence mA000079 = new A000079();
  final Sequence mA002618 = new A002618();
  @Override
  public Z next() {
    return mA000079.next().subtract(mA002618.next());
  }

}
