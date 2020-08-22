package irvine.oeis.a254;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A254613 Expansion of f(-x^3)^4 / (f(-x) * f(-x^9)) in powers of x where f() is a Ramanujan theta function.
 * @author Georg Fischer
 */
public class A254613 extends EulerTransform {

  /** Construct the sequence. */
  public A254613() {
    super(new PeriodicSequence(1, 1, -3, 1, 1, -3, 1, 1, -2), 1);
  }
}
