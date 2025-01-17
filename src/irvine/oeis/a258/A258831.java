package irvine.oeis.a258;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A258831 Expansion of (psi(-x^3) * f(-x, x^2))^2 in powers of x where psi(), f(,) are Ramanujan theta functions.
 * @author Georg Fischer
 */
public class A258831 extends EulerTransform {

  /** Construct the sequence. */
  public A258831() {
    super(new PeriodicSequence(-2, 2, 0, 0, -2, -4, -2, 0, 0, 2, -2, -4), 1);
  }
}
