package irvine.oeis.a337;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a003.A003961;
import irvine.oeis.a003.A003972;

/**
 * A337544 a(n) = 2*phi(A003961(n)) - A003961(n).
 * @author Georg Fischer
 */
public class A337544 implements Sequence {

  final Sequence mA003961 = new A003961();
  final Sequence mA003972 = new A003972();
  @Override
  public Z next() {
    return Z.TWO.multiply(mA003972.next()).subtract(mA003961.next());
  }

}
