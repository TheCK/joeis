package irvine.oeis.a243;
// Generated by gen_seq4.pl deriv at 2020-07-01 19:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a084.A084768;

/**
 * A243944 a(n) = A084768(n)^2.
 * @author Georg Fischer
 */
public class A243944 implements Sequence {

  final Sequence mA084768 = new A084768();
  @Override
  public Z next() {
    return mA084768.next().pow(Z.TWO);
  }

}
