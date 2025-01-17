package irvine.oeis.a058;
// Generated by gen_seq4.pl eulerps 0 at 2020-11-16 21:39
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A058624 McKay-Thompson series of class 30c for Monster.
 * Somos formula: <code>e30c=ecalc([1, 1;5, 1;3,-1;15,-1}],[2, 1]);</code>
 * @author Georg Fischer
 */
public class A058624 extends EulerTransform {

  /** Construct the sequence. */
  public A058624() {
    super(new PeriodicSequence(-1, -1, 0, -1, -2, 0, -1, -1, 0, -2, -1, 0, -1, -1, 0), 1);
  }
}
