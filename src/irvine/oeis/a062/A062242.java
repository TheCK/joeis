package irvine.oeis.a062;
// Generated by gen_seq4.pl eulerps 0 at 2020-11-16 21:39
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A062242 McKay-Thompson series of class 18D for the Monster group.
 * Somos formula: <code>e18D1=ecalc([2, 1;3, 3;1,-1;6,-3}],[3, 1]);</code>
 * @author Georg Fischer
 */
public class A062242 extends EulerTransform {

  /** Construct the sequence. */
  public A062242() {
    super(new PeriodicSequence(1, 0, -2, 0, 1, 0), 1);
  }
}
