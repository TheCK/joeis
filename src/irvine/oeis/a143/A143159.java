package irvine.oeis.a143;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A143159 Expansion of q^(-13/24) * eta(q^2) * eta(q^3) * eta(q^4)^2 in powers of q.
 * @author Georg Fischer
 */
public class A143159 extends EulerTransform {

  /** Construct the sequence. */
  public A143159() {
    super(new PeriodicSequence(0, -1, -1, -3, 0, -2, 0, -3, -1, -1, 0, -4), 1);
  }
}
