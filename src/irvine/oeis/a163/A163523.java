package irvine.oeis.a163;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000005;
import irvine.oeis.a001.A001221;

/**
 * A163523 a(n) = tau(n) + omega(n).
 * @author Georg Fischer
 */
public class A163523 implements Sequence {

  final Sequence mA000005 = new A000005();
  final Sequence mA001221 = new A001221();
  @Override
  public Z next() {
    return mA000005.next().add(mA001221.next());
  }

}
