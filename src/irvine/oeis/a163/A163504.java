package irvine.oeis.a163;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a014.A014076;

/**
 * A163504 a(n) = abs(n-th prime minus n-th odd nonprime).
 * @author Georg Fischer
 */
public class A163504 implements Sequence {

  final Sequence mA000040 = new A000040();
  final Sequence mA014076 = new A014076();
  @Override
  public Z next() {
    return mA000040.next().subtract(mA014076.next()).abs();
  }

}
