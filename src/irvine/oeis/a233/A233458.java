package irvine.oeis.a233;
// Generated by gen_seq4.pl eulerxfm -1 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A233458 Expansion of q^(-1) * (phi(q^2) * phi(-q) / psi(-q^2)^2)^2 in powers of q where phi(), psi() are Ramanujan theta functions.
 * @author Georg Fischer
 */
public class A233458 extends EulerTransform {

  /** Construct the sequence. */
  public A233458() {
    super(new PeriodicSequence(-4, 6, -4, -8, -4, 6, -4, 0), 1);
  }
}
