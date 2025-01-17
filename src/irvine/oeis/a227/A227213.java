package irvine.oeis.a227;
// Generated by gen_seq4.pl eulerxfm 1 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A227213 Expansion of (eta(q^5) * eta(q^10) / (eta(q) * eta(q^2)))^2 in powers of q.
 * @author Georg Fischer
 */
public class A227213 extends EulerTransform {

  /** Construct the sequence. */
  public A227213() {
    super(new PeriodicSequence(2, 4, 2, 4, 0, 4, 2, 4, 2, 0), 1);
  }
}
