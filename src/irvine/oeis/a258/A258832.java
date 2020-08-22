package irvine.oeis.a258;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A258832 Expansion of psi(-x^3) * f(-x, x^2) in powers of x where psi(), f(,) are Ramanujan theta functions.
 * @author Georg Fischer
 */
public class A258832 extends EulerTransform {

  /** Construct the sequence. */
  public A258832() {
    super(new PeriodicSequence(-1, 1, 0, 0, -1, -2, -1, 0, 0, 1, -1, -2), 1);
  }
}
