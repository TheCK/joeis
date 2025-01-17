package irvine.oeis.a080;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A080963 Expansion of theta_3(q)*theta_3(q^2)*theta_4(q^8) in powers of q.
 * @author Georg Fischer
 */
public class A080963 extends EulerTransform {

  /** Construct the sequence. */
  public A080963() {
    super(new PeriodicSequence(2, -1, 2, -4, 2, -1, 2, -4, 2, -1, 2, -4, 2, -1, 2, -3), 1);
  }
}
