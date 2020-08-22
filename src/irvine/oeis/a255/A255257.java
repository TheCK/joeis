package irvine.oeis.a255;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A255257 Expansion of psi(x) * phi(-x^2)^2 in powers of x where phi(), psi() are Ramanujan theta functions.
 * @author Georg Fischer
 */
public class A255257 extends EulerTransform {

  /** Construct the sequence. */
  public A255257() {
    super(new PeriodicSequence(1, -5, 1, -3), 1);
  }
}
