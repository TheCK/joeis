package irvine.oeis.a233;
// Generated by gen_seq4.pl eulerxfm 1 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A233693 Expansion of q * psi(-q) * chi(-q^6) * psi(-q^9) / (phi(-q) * phi(-q^18)) in powers of q where phi(), psi(), chi() are Ramanujan theta functions.
 * @author Georg Fischer
 */
public class A233693 extends EulerTransform {

  /** Construct the sequence. */
  public A233693() {
    super(new PeriodicSequence(1, 1, 1, 0, 1, 0, 1, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 2, 1, 0, 1, 1, 1, 0, 1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 0), 1);
  }
}
