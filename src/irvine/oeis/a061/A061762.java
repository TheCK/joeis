package irvine.oeis.a061;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a007.A007953;
import irvine.oeis.a007.A007954;

/**
 * A061762 a(n) = (sum of digits of n) + (product of digits of n).
 * @author Georg Fischer
 */
public class A061762 implements Sequence {

  final Sequence mA007953 = new A007953();
  final Sequence mA007954 = new A007954();
  @Override
  public Z next() {
    return mA007953.next().add(mA007954.next());
  }

}
