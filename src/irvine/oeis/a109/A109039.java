package irvine.oeis.a109;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A109039 Expansion of eta(q) * eta(q^3) * (eta(q^4) * eta(q^6) / eta(q^12))^2 in powers of q.
 * @author Georg Fischer
 */
public class A109039 extends EulerTransform {

  /** Construct the sequence. */
  public A109039() {
    super(new PeriodicSequence(-1, -1, -2, -3, -1, -4, -1, -3, -2, -1, -1, -4), 1);
  }
}
