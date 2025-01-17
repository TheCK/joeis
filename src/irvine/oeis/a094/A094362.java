package irvine.oeis.a094;
// Generated by gen_seq4.pl eulerps -1 at 2020-11-16 21:39
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A094362 McKay-Thompson series of class 39C for the Monster group with a(0) = 1.
 * Somos formula: <code>e39C=ecalc([3, 1;13, 1;1,-1;39,-1}]);</code>
 * @author Georg Fischer
 */
public class A094362 extends EulerTransform {

  /** Construct the sequence. */
  public A094362() {
    super(new PeriodicSequence(1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0, 0, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0), 1);
  }
}
