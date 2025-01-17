package irvine.oeis.a008;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A008443 Number of ordered ways of writing n as the sum of 3 triangular numbers.
 * @author Georg Fischer
 */
public class A008443 extends EulerTransform {

  /** Construct the sequence. */
  public A008443() {
    super(new PeriodicSequence(3, -3), 1);
  }
}
