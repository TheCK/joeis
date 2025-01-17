package irvine.oeis.a058;
// Generated by gen_seq4.pl eulerps 0 at 2020-11-16 21:39
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A058729 McKay-Thompson series of class 60E for the Monster group.
 * Somos formula: <code>e60E=ecalc([2, 1;3, 1;10, 1;15, 1;1,-1;5,-1;6,-1;30,-1}],[2, 1]);</code>
 * @author Georg Fischer
 */
public class A058729 extends EulerTransform {

  /** Construct the sequence. */
  public A058729() {
    super(new PeriodicSequence(1, 0, 0, 0, 2, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 2, 0, 0, 0, 1, 0), 1);
  }
}
