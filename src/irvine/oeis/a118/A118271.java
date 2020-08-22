package irvine.oeis.a118;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A118271 Expansion of (9 * theta_4(q^3)^4 - theta_4(q)^4) / 8 in powers of q.
 * @author Georg Fischer
 */
public class A118271 extends EulerTransform {

  /** Construct the sequence. */
  public A118271() {
    super(new PeriodicSequence(1, -4, -2, -4, 1, -4), 1);
  }
}
