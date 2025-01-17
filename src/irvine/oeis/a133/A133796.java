package irvine.oeis.a133;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a001.A001358;

/**
 * A133796 a(n) = n-th prime + n-th semiprime.
 * @author Georg Fischer
 */
public class A133796 implements Sequence {

  final Sequence mA000040 = new A000040();
  final Sequence mA001358 = new A001358();
  @Override
  public Z next() {
    return mA000040.next().add(mA001358.next());
  }

}
