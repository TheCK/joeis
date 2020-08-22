package irvine.oeis.a253;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A253243 Expansion of phi(-x^2) * psi(x^3) * chi(x^3) in powers of x where phi(), psi(), chi() are Ramanujan theta functions.
 * @author Georg Fischer
 */
public class A253243 extends EulerTransform {

  /** Construct the sequence. */
  public A253243() {
    super(new PeriodicSequence(0, -2, 2, -1, 0, -4, 0, -1, 2, -2, 0, -2), 1);
  }
}
