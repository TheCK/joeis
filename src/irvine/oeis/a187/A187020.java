package irvine.oeis.a187;
// Generated by gen_seq4.pl eulerps -1 at 2020-11-16 21:39
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A187020 McKay-Thompson series of class 36D for the Monster group with a(0) = 1.
 * Somos formula: <code>e36D1=ecalc([4, 1;9, 1;1,-1;36,-1}]);</code>
 * @author Georg Fischer
 */
public class A187020 extends EulerTransform {

  /** Construct the sequence. */
  public A187020() {
    super(new PeriodicSequence(1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 0, 1, 0, 1, 1, 1, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 0), 1);
  }
}
