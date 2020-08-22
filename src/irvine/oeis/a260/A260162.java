package irvine.oeis.a260;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A260162 Expansion of phi(-x) / psi(-x^3) in powers of x where psi(), phi() are Ramanujan theta functions.
 * @author Georg Fischer
 */
public class A260162 extends EulerTransform {

  /** Construct the sequence. */
  public A260162() {
    super(new PeriodicSequence(-2, -1, -1, -1, -2, -1, -2, -1, -1, -1, -2, 0), 1);
  }
}
