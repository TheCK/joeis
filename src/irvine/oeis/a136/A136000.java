package irvine.oeis.a136;
// Generated by gen_seq4.pl deriv at 2020-07-01 19:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a010.A010814;

/**
 * A136000 A010814(n) - 1.
 * @author Georg Fischer
 */
public class A136000 implements Sequence {

  final Sequence mA010814 = new A010814();
  @Override
  public Z next() {
    return mA010814.next().subtract(Z.ONE);
  }

}
