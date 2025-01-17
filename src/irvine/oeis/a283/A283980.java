package irvine.oeis.a283;
// Generated by gen_seq4.pl deriv at 2020-07-01 19:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a003.A003961;
import irvine.oeis.a006.A006519;

/**
 * A283980 a(n) = A003961(n)*A006519(n).
 * @author Georg Fischer
 */
public class A283980 implements Sequence {

  final Sequence mA003961 = new A003961();
  final Sequence mA006519 = new A006519();
  @Override
  public Z next() {
    return mA003961.next().multiply(mA006519.next());
  }

}
