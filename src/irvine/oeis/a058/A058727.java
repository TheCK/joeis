package irvine.oeis.a058;
// Generated by gen_seq4.pl eulerps -1 at 2020-11-16 21:39
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A058727 McKay-Thompson series of class 60C for Monster.
 * Somos formula: <code>e60C3=ecalc([6, 3;10, 3;2,-1;3,-1;5,-1;12,-1;20,-1;30,-1}]);</code>
 * @author Georg Fischer
 */
public class A058727 extends EulerTransform {

  /** Construct the sequence. */
  public A058727() {
    super(new PeriodicSequence(0, 1, 1, 1, 1, -1, 0, 1, 1, -1, 0, 0, 0, 1, 2, 1, 0, -1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 1, 0, -2, 0, 1, 1, 1, 1, 0, 0, 1, 1, 0, 0, -1, 0, 1, 2, 1, 0, 0, 0, -1, 1, 1, 0, -1, 1, 1, 1, 1, 0, 0), 1);
  }
}
