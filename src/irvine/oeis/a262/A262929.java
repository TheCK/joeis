package irvine.oeis.a262;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A262929 Expansion of phi(-x^3) / psi(x^4) in powers of x where phi(), psi() are Ramanujan theta functions.
 * @author Georg Fischer
 */
public class A262929 extends EulerTransform {

  /** Construct the sequence. */
  public A262929() {
    super(new PeriodicSequence(0, 0, -2, -1, 0, -1, 0, 1, -2, 0, 0, -2, 0, 0, -2, 1, 0, -1, 0, -1, -2, 0, 0, 0), 1);
  }
}
