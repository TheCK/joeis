package irvine.oeis.a051;
// Generated by gen_seq4.pl deriv at 2020-07-01 19:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a028.A028317;

/**
 * A051472 <code>(A028317)/2</code>.
 * @author Georg Fischer
 */
public class A051472 implements Sequence {

  final Sequence mA028317 = new A028317();
  /** Construct the sequence. */
  public A051472() {
  }
  
  @Override
  public Z next() {
    return mA028317.next().divide(Z.TWO);
  }

}
