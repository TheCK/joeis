package irvine.oeis.a258;
// Generated by gen_seq4.pl eulerxfm -1 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A258093 Expansion of q^(-1) * psi(q) / psi(q^3)^3 in powers of q where psi() is a Ramanujan theta function.
 * @author Georg Fischer
 */
public class A258093 extends EulerTransform {

  /** Construct the sequence. */
  public A258093() {
    super(new PeriodicSequence(1, -1, -2, -1, 1, 2), 1);
  }
}
