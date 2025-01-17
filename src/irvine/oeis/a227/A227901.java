package irvine.oeis.a227;
// Generated by gen_seq4.pl eulerxfm 2 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A227901 Expansion of eta(q)^3 * eta(q^5)^9 in powers of q.
 * @author Georg Fischer
 */
public class A227901 extends EulerTransform {

  /** Construct the sequence. */
  public A227901() {
    super(new PeriodicSequence(-3, -3, -3, -3, -12), 1);
  }
}
