package irvine.oeis.a260;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A260600 Expansion of x * psi(x^3) * psi(x^12) / f(-x) in powers of x where psi(), f() are Ramanujan theta functions.
 * @author Georg Fischer
 */
public class A260600 extends EulerTransform {

  /** Construct the sequence. */
  public A260600() {
    super(new PeriodicSequence(1, 1, 2, 1, 1, 0, 1, 1, 2, 1, 1, 1, 1, 1, 2, 1, 1, 0, 1, 1, 2, 1, 1, -1), 0, 1);
  }
}
