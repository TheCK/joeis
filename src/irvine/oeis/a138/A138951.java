package irvine.oeis.a138;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A138951 Expansion of eta(q^2)^7 * eta(q^3)^2 * eta(q^12) / (eta(q)^2 * eta(q^4)^3 * eta(q^6)^3) in powers of q.
 * @author Georg Fischer
 */
public class A138951 extends EulerTransform {

  /** Construct the sequence. */
  public A138951() {
    super(new PeriodicSequence(2, -5, 0, -2, 2, -4, 2, -2, 0, -5, 2, -2), 1);
  }
}
