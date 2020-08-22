package irvine.oeis.a159;
// Generated by gen_seq4.pl deriv at 2020-07-01 19:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a008.A008474;

/**
 * A159076 A008474(n) + 2.
 * @author Georg Fischer
 */
public class A159076 implements Sequence {

  final Sequence mA008474 = new A008474();
  /** Construct the sequence. */
  public A159076() {
  }
  
  @Override
  public Z next() {
    return mA008474.next().add(Z.TWO);
  }

}
