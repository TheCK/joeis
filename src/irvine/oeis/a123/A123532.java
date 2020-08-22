package irvine.oeis.a123;
// Generated by gen_seq4.pl eulerxfm 1 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A123532 Expansion of (eta(q) * eta(q^6))^7 / (eta(q^2) * eta(q^3))^5 in powers of q.
 * @author Georg Fischer
 */
public class A123532 extends EulerTransform {

  /** Construct the sequence. */
  public A123532() {
    super(new PeriodicSequence(-7, -2, -2, -2, -7, -4), 1);
  }
}
