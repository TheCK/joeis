package irvine.oeis.a260;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A260486 Expansion of phi(-x)^2 * phi(-x^6) / phi(-x^3) in powers of x where phi() is a Ramanujan theta function.
 * @author Georg Fischer
 */
public class A260486 extends EulerTransform {

  /** Construct the sequence. */
  public A260486() {
    super(new PeriodicSequence(-4, -2, -2, -2, -4, -3, -4, -2, -2, -2, -4, -2), 1);
  }
}
