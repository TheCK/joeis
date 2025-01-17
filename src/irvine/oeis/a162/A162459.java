package irvine.oeis.a162;
// Generated by gen_seq4.pl deriv at 2020-07-01 19:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000079;
import irvine.oeis.a002.A002321;

/**
 * A162459 A002321*A000079.
 * @author Georg Fischer
 */
public class A162459 implements Sequence {

  final Sequence mA000079 = new A000079();
  final Sequence mA002321 = new A002321();
  @Override
  public Z next() {
    return mA002321.next().multiply(mA000079.next());
  }

}
