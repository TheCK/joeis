package irvine.oeis.a208;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A208664 Expansion of f(x) * f(x^11) in powers of x where f() is a Ramanujan theta function.
 * @author Georg Fischer
 */
public class A208664 extends EulerTransform {

  /** Construct the sequence. */
  public A208664() {
    super(new PeriodicSequence(1, -2, 1, -1, 1, -2, 1, -1, 1, -2, 2, -1, 1, -2, 1, -1, 1, -2, 1, -1, 1, -4, 1, -1, 1, -2, 1, -1, 1, -2, 1, -1, 2, -2, 1, -1, 1, -2, 1, -1, 1, -2, 1, -2), 1);
  }
}
