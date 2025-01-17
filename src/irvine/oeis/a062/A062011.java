package irvine.oeis.a062;
// Generated by gen_seq4.pl deriv at 2020-07-01 19:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000005;

/**
 * A062011 a(n) = 2*tau(n) = 2*A000005(n).
 * @author Georg Fischer
 */
public class A062011 implements Sequence {

  final Sequence mA000005 = new A000005();
  @Override
  public Z next() {
    return Z.TWO.multiply(mA000005.next());
  }

}
