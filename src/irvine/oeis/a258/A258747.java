package irvine.oeis.a258;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A258747 Expansion of chi(-x) * f(x^3) * f(-x^6) in powers of x where chi(), f() are Ramanujan theta functions.
 * @author Georg Fischer
 */
public class A258747 extends EulerTransform {

  /** Construct the sequence. */
  public A258747() {
    super(new PeriodicSequence(-1, 0, 0, 0, -1, -3, -1, 0, 0, 0, -1, -2), 1);
  }
}
