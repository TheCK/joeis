package irvine.oeis.a213;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A213267 Expansion of phi(q^9) / (psi(-q) * chi(q^3)) in powers of q where phi(), psi(), chi() are Ramanujan theta functions.
 * @author Georg Fischer
 */
public class A213267 extends EulerTransform {

  /** Construct the sequence. */
  public A213267() {
    super(new PeriodicSequence(1, 0, 0, 1, 1, 1, 1, 1, 2, 0, 1, 1, 1, 0, 0, 1, 1, -2, 1, 1, 0, 0, 1, 1, 1, 0, 2, 1, 1, 1, 1, 1, 0, 0, 1, 0), 1);
  }
}
