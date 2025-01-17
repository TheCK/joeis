package irvine.oeis.a062;
// Generated by gen_seq4.pl eulerps 0 at 2020-11-16 21:39
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A062243 McKay-Thompson series of class 24c for the Monster group.
 * Somos formula: <code>e24c=ecalc([1, 1;4, 1;6, 1;2,-1;3,-1;12,-1}],[2, 2]);</code>
 * @author Georg Fischer
 */
public class A062243 extends EulerTransform {

  /** Construct the sequence. */
  public A062243() {
    super(new PeriodicSequence(-2, 0, 0, -2, -2, 0, -2, -2, 0, 0, -2, 0), 1);
  }
}
