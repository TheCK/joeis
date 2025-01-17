package irvine.oeis.a327;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000010;
import irvine.oeis.a002.A002618;

/**
 * A327570 a(n) = n*phi(n)^2, phi = A000010.
 * @author Georg Fischer
 */
public class A327570 implements Sequence {

  final Sequence mA000010 = new A000010();
  final Sequence mA002618 = new A002618();
  @Override
  public Z next() {
    return mA000010.next().multiply(mA002618.next());
  }

}
