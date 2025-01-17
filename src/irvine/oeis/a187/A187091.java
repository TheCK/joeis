package irvine.oeis.a187;
// Generated by gen_seq4.pl eulerps -1 at 2020-11-16 21:39
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A187091 McKay-Thompson series of class 12H for the Monster group with a(0) = 4.
 * Somos formula: <code>e12H1=ecalc([3, 1;4, 1;1,-1;12,-1}],[1, 4]);</code>
 * @author Georg Fischer
 */
public class A187091 extends EulerTransform {

  /** Construct the sequence. */
  public A187091() {
    super(new PeriodicSequence(4, 4, 0, 0, 4, 0, 4, 0, 0, 4, 4, 0), 1);
  }
}
