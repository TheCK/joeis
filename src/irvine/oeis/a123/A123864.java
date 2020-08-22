package irvine.oeis.a123;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A123864 Expansion of (eta(q^3) * eta(q^5))^2 / (eta(q) * eta(q^15)) in powers of q.
 * @author Georg Fischer
 */
public class A123864 extends EulerTransform {

  /** Construct the sequence. */
  public A123864() {
    super(new PeriodicSequence(1, 1, -1, 1, -1, -1, 1, 1, -1, -1, 1, -1, 1, 1, -2), 1);
  }
}
