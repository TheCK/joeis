package irvine.oeis.a111;
// Generated by gen_seq4.pl eulerxfm 1 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A111580 Expansion of eta(q)^2 * eta(q^2) * eta(q^10)^3 / eta(q^5)^2 in powers of q.
 * @author Georg Fischer
 */
public class A111580 extends EulerTransform {

  /** Construct the sequence. */
  public A111580() {
    super(new PeriodicSequence(-2, -3, -2, -3, 0, -3, -2, -3, -2, -4), 1);
  }
}
