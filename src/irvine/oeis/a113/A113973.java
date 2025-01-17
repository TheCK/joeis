package irvine.oeis.a113;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A113973 Expansion of phi(x^3)^3/phi(x) where phi() is a Ramanujan theta function.
 * @author Georg Fischer
 */
public class A113973 extends EulerTransform {

  /** Construct the sequence. */
  public A113973() {
    super(new PeriodicSequence(-2, 3, 4, 1, -2, -6, -2, 1, 4, 3, -2, -2), 1);
  }
}
