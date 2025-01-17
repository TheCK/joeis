package irvine.oeis.a329;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A329651 Expansion of x * (psi(x^6) / psi(-x^3))^3 * phi(-x)^5 / psi(-x) in powers of x where phi(), psi() are Ramanujan theta functions.
 * @author Georg Fischer
 */
public class A329651 extends EulerTransform {

  /** Construct the sequence. */
  public A329651() {
    super(new PeriodicSequence(-9, -5, -6, -4, -9, -2, -9, -4, -6, -5, -9, -4), 0, 1);
  }
}
