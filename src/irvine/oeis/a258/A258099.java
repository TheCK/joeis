package irvine.oeis.a258;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A258099 Expansion of ( psi(x^3) * phi(-x^3) / (psi(x) * f(-x^2)) )^2 in powers of x where phi(), psi(), f() are Ramanujan theta functions.
 * @author Georg Fischer
 */
public class A258099 extends EulerTransform {

  /** Construct the sequence. */
  public A258099() {
    super(new PeriodicSequence(-2, 4, -4, 4, -2, 0), 1);
  }
}
