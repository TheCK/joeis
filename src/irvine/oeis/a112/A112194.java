package irvine.oeis.a112;
// Generated by gen_seq4.pl eulerps 0 at 2020-11-16 21:39
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A112194 McKay-Thompson series of class 54c for the Monster group.
 * Somos formula: <code>e54c=ecalc([3, 2;1,-1;9,-1}],[6, 1]);</code>
 * @author Georg Fischer
 */
public class A112194 extends EulerTransform {

  /** Construct the sequence. */
  public A112194() {
    super(new PeriodicSequence(1, 1, -1, 1, 1, -1, 1, 1, 0), 1);
  }
}
