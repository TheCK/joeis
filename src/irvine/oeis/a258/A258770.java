package irvine.oeis.a258;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A258770 Expansion of f(-x^2)^4 * psi(-x^3) in powers of x where psi(), f() are Ramanujan theta functions.
 * @author Georg Fischer
 */
public class A258770 extends EulerTransform {

  /** Construct the sequence. */
  public A258770() {
    super(new PeriodicSequence(0, -4, -1, -4, 0, -4, 0, -4, -1, -4, 0, -5), 1);
  }
}
