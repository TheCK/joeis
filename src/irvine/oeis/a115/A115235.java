package irvine.oeis.a115;
// Generated by gen_seq4.pl eulerxfm 1 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A115235 Expansion of eta(q)^2*eta(q^9)*eta(q^18)/(eta(q^2)*eta(q^3)) in powers of q.
 * @author Georg Fischer
 */
public class A115235 extends EulerTransform {

  /** Construct the sequence. */
  public A115235() {
    super(new PeriodicSequence(-2, -1, -1, -1, -2, 0, -2, -1, -2, -1, -2, 0, -2, -1, -1, -1, -2, -2), 1);
  }
}
