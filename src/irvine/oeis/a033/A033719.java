package irvine.oeis.a033;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A033719 Coefficients in expansion of theta_3(q) * theta_3(q^7) in powers of q.
 * @author Georg Fischer
 */
public class A033719 extends EulerTransform {

  /** Construct the sequence. */
  public A033719() {
    super(new PeriodicSequence(2, -3, 2, -1, 2, -3, 4, -1, 2, -3, 2, -1, 2, -6, 2, -1, 2, -3, 2, -1, 4, -3, 2, -1, 2, -3, 2, -2), 1);
  }
}
