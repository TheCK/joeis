package irvine.oeis.a179;
// Generated by gen_seq4.pl deriv at 2020-07-01 19:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000037;

/**
 * A179125 a(n) = A000037(n)^3.
 * @author Georg Fischer
 */
public class A179125 implements Sequence {

  final Sequence mA000037 = new A000037();
  @Override
  public Z next() {
    return mA000037.next().pow(Z.THREE);
  }

}
