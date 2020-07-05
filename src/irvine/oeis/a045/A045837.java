package irvine.oeis.a045;
// Generated by gen_seq4.pl deriv at 2020-07-01 19:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a005.A005888;

/**
 * A045837 <code>a(n) = A005888(n)/2</code>.
 * @author Georg Fischer
 */
public class A045837 implements Sequence {

  final Sequence mA005888 = new A005888();
  /** Construct the sequence. */
  public A045837() {
  }
  
  @Override
  public Z next() {
    return mA005888.next().divide(Z.TWO);
  }

}
