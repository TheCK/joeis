package irvine.oeis.a208;
// Generated by gen_seq4.pl eulerps -1 at 2020-11-16 21:39
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A208603 McKay-Thompson series of class 16B for the Monster group with a(0) = 2.
 * Somos formula: <code>e16B2=ecalc([2, 5;8, 1;1,-2;4,-2;16,-2}],, 4);</code>
 * @author Georg Fischer
 */
public class A208603 extends EulerTransform {

  /** Construct the sequence. */
  public A208603() {
    super(new PeriodicSequence(2, -3, 2, -1, 2, -3, 2, -2, 2, -3, 2, -1, 2, -3, 2, 0), 1);
  }
}
