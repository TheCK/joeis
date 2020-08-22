package irvine.oeis.a262;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A262150 Expansion of f(-x^3)^3 / (f(-x^2) * f(-x^4)^2) in powers of x where f() is a Ramanujan theta function.
 * @author Georg Fischer
 */
public class A262150 extends EulerTransform {

  /** Construct the sequence. */
  public A262150() {
    super(new PeriodicSequence(0, 1, -3, 3, 0, -2, 0, 3, -3, 1, 0, 0), 1);
  }
}
