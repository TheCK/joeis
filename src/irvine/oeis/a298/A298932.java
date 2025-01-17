package irvine.oeis.a298;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A298932 Expansion of f(-x^3)^3 * phi(-x^12) / (f(-x) * chi(-x^4)) in powers of x where phi(), chi(), f() are Ramanujan theta functions.
 * @author Georg Fischer
 */
public class A298932 extends EulerTransform {

  /** Construct the sequence. */
  public A298932() {
    super(new PeriodicSequence(1, 1, -2, 2, 1, -2, 1, 1, -2, 1, 1, -3, 1, 1, -2, 1, 1, -2, 1, 2, -2, 1, 1, -3), 1);
  }
}
