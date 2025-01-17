package irvine.oeis.a252;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A252651 Expansion of q^(-1/2) * (eta(q) * eta(q^2) * eta(q^6) / eta(q^3))^2 in powers of q.
 * @author Georg Fischer
 */
public class A252651 extends EulerTransform {

  /** Construct the sequence. */
  public A252651() {
    super(new PeriodicSequence(-2, -4, 0, -4, -2, -4), 1);
  }
}
