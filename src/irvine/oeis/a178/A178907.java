package irvine.oeis.a178;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a003.A003068;

/**
 * A178907 n-th prime + n-th problime (third definition).
 * @author Georg Fischer
 */
public class A178907 implements Sequence {

  final Sequence mA000040 = new A000040();
  final Sequence mA003068 = new A003068();
  @Override
  public Z next() {
    return mA000040.next().add(mA003068.next());
  }

}
