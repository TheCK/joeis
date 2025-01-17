package irvine.oeis.a187;
// Generated by gen_seq4.pl eulerps -1 at 2020-11-16 21:39
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A187130 McKay-Thompson series of class 12I for the Monster group with a(0) = -3.
 * Somos formula: <code>e12I4=ecalc([1, 3;4, 1;6, 2;2,-2;3,-1;12,-3}],, 2);</code>
 * @author Georg Fischer
 */
public class A187130 extends EulerTransform {

  /** Construct the sequence. */
  public A187130() {
    super(new PeriodicSequence(-3, -1, -2, -2, -3, -2, -3, -2, -2, -1, -3, 0), 1);
  }
}
