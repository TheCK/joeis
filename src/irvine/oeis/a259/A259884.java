package irvine.oeis.a259;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A259884 Expansion of phi(x) * f(-x^3)^3 / f(-x) in powers of x where phi(), f() are Ramanujan theta functions.
 * @author Georg Fischer
 */
public class A259884 extends EulerTransform {

  /** Construct the sequence. */
  public A259884() {
    super(new PeriodicSequence(3, -2, 0, 0, 3, -5, 3, 0, 0, -2, 3, -3), 1);
  }
}
