package irvine.oeis.a159;
// Generated by gen_seq4.pl eulerxfm 1 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A159814 Expansion of eta(z)^2*eta(4*z)^6/eta(2*z).
 * @author Georg Fischer
 */
public class A159814 extends EulerTransform {

  /** Construct the sequence. */
  public A159814() {
    super(new PeriodicSequence(-2, -1, -2, -7), 1);
  }
}
