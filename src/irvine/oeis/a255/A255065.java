package irvine.oeis.a255;
// Generated by gen_seq4.pl eulerxfm 1 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A255065 Expansion of x * psi(x^5) * f(-x^10) / f(-x^4, -x^6) in powers of x where psi(), f() are Ramanujan theta functions.
 * @author Georg Fischer
 */
public class A255065 extends EulerTransform {

  /** Construct the sequence. */
  public A255065() {
    super(new PeriodicSequence(0, 0, 0, 1, 1, 1, 0, 0, 0, -1), 1);
  }
}
