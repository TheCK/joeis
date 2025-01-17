package irvine.oeis.a033;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A033717 Number of integer solutions to the equation x^2 + 2*y^2 + 4*z^2 = n.
 * @author Georg Fischer
 */
public class A033717 extends EulerTransform {

  /** Construct the sequence. */
  public A033717() {
    super(new PeriodicSequence(2, -1, 2, -2, 2, -1, 2, -5, 2, -1, 2, -2, 2, -1, 2, -3), 1);
  }
}
