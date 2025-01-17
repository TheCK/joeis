package irvine.oeis.a139;
// Generated by gen_seq4.pl eulerxfm -1 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A139216 Expansion of q^(-1) * psi(-q) * phi(-q^9) / (psi(-q^3) * psi(q^6)) in power of q where phi(), psi() are Ramanujan theta functions.
 * @author Georg Fischer
 */
public class A139216 extends EulerTransform {

  /** Construct the sequence. */
  public A139216() {
    super(new PeriodicSequence(-1, 0, 0, -1, -1, -1, -1, -1, -2, 0, -1, 1, -1, 0, 0, -1, -1, -2, -1, -1, 0, 0, -1, 1, -1, 0, -2, -1, -1, -1, -1, -1, 0, 0, -1, 0), 1);
  }
}
