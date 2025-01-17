package irvine.oeis.a230;
// Generated by gen_seq4.pl deriv at 2020-07-01 19:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a007.A007521;

/**
 * A230076 (A007521(n)-1)/4.
 * @author Georg Fischer
 */
public class A230076 implements Sequence {

  final Sequence mA007521 = new A007521();
  @Override
  public Z next() {
    return mA007521.next().subtract(Z.ONE).divide(Z.FOUR);
  }

}
