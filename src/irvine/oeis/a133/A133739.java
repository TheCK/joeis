package irvine.oeis.a133;
// Generated by gen_seq4.pl eulerxfm 1 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A133739 Expansion of q * (psi(q^6) / psi(q^3))^3 * phi(q)^5 / psi(q) in powers of q where phi(), psi() are Ramanujan theta functions.
 * @author Georg Fischer
 */
public class A133739 extends EulerTransform {

  /** Construct the sequence. */
  public A133739() {
    super(new PeriodicSequence(9, -14, 6, -4, 9, -8, 9, -4, 6, -14, 9, -4), 1);
  }
}
