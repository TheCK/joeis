package irvine.oeis.a213;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A213266 Expansion of psi(q) * psi(q^9) / (psi(q^2) * chi(q^3) * psi(-q^9)) in powers of q where psi(), chi() are Ramanujan theta functions.
 * @author Georg Fischer
 */
public class A213266 extends EulerTransform {

  /** Construct the sequence. */
  public A213266() {
    super(new PeriodicSequence(1, -2, 0, 0, 1, -1, 1, 0, 2, -2, 1, 0, 1, -2, 0, 0, 1, -2, 1, 0, 0, -2, 1, 0, 1, -2, 2, 0, 1, -1, 1, 0, 0, -2, 1, 0), 1);
  }
}
