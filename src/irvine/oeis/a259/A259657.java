package irvine.oeis.a259;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A259657 Expansion of phi(-x^3) * f(-x^4)^3 / f(-x^12) in powers of x where phi(), f() are Ramanujan theta functions.
 * @author Georg Fischer
 */
public class A259657 extends EulerTransform {

  /** Construct the sequence. */
  public A259657() {
    super(new PeriodicSequence(0, 0, -2, -3, 0, -1, 0, -3, -2, 0, 0, -3), 1);
  }
}
