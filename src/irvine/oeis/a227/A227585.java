package irvine.oeis.a227;
// Generated by gen_seq4.pl eulerps -1 at 2020-11-16 21:39
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A227585 McKay-Thompson series of class 36A for the Monster group with a(0) = 2.
 * Somos formula: <code>e36A3=ecalc([2, 1;3, 2;12, 2;18, 1;1,-1;4,-1;6,-2;9,-1;36,-1}],[1, 2]);</code>
 * @author Georg Fischer
 */
public class A227585 extends EulerTransform {

  /** Construct the sequence. */
  public A227585() {
    super(new PeriodicSequence(2, 0, -2, 2, 2, 0, 2, 2, 0, 0, 2, -2, 2, 0, -2, 2, 2, 0, 2, 2, -2, 0, 2, -2, 2, 0, 0, 2, 2, 0, 2, 2, -2, 0, 2, 0), 1);
  }
}
