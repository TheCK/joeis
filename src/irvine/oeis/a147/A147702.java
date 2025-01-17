package irvine.oeis.a147;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A147702 Expansion of eta(q) * eta(q^10)^3 / (eta(q^2) * eta(q^4) * eta(q^5) * eta(q^20)) in powers of q.
 * @author Georg Fischer
 */
public class A147702 extends EulerTransform {

  /** Construct the sequence. */
  public A147702() {
    super(new PeriodicSequence(-1, 0, -1, 1, 0, 0, -1, 1, -1, -2, -1, 1, -1, 0, 0, 1, -1, 0, -1, 0), 1);
  }
}
