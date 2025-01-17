package irvine.oeis.a256;
// Generated by gen_seq4.pl deriv at 2020-07-01 19:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a166.A166133;

/**
 * A256557 a(n) = A166133(n)^2 - 1.
 * @author Georg Fischer
 */
public class A256557 implements Sequence {

  final Sequence mA166133 = new A166133();
  @Override
  public Z next() {
    return mA166133.next().pow(Z.TWO).subtract(Z.ONE);
  }

}
