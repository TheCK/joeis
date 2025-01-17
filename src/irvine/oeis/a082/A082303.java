package irvine.oeis.a082;
// Generated by gen_seq4.pl eulerps 0 at 2020-11-16 21:39
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A082303 McKay-Thompson series of class 32e for the Monster group.
 * Somos formula: <code>e32e=ecalc([1, 1;4,-1}],[8, 1]);</code>
 * @author Georg Fischer
 */
public class A082303 extends EulerTransform {

  /** Construct the sequence. */
  public A082303() {
    super(new PeriodicSequence(-1, -1, -1, 0), 1);
  }
}
