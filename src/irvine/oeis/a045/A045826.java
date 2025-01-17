package irvine.oeis.a045;
// Generated by gen_seq4.pl deriv at 2020-07-01 19:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a005.A005887;

/**
 * A045826 a(n) = A005887(n) / 2.
 * @author Georg Fischer
 */
public class A045826 implements Sequence {

  final Sequence mA005887 = new A005887();
  @Override
  public Z next() {
    return mA005887.next().divide(Z.TWO);
  }

}
