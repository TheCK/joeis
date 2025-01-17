package irvine.oeis.a187;
// Generated by gen_seq4.pl eulerps -1 at 2020-11-16 21:39
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A187146 McKay-Thompson series of class 12B for the Monster group with a(0) = 5.
 * Somos formula: <code>e12B1=ecalc([2, 14;1,-5;3,-1;4,-5;6,-2;12,-1}]);</code>
 * @author Georg Fischer
 */
public class A187146 extends EulerTransform {

  /** Construct the sequence. */
  public A187146() {
    super(new PeriodicSequence(5, -9, 6, -4, 5, -6, 5, -4, 6, -9, 5, 0), 1);
  }
}
