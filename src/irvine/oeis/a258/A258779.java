package irvine.oeis.a258;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A258779 Expansion of (f(-x) * phi(x))^2 in powers of x where phi(), f() are Ramanujan theta functions.
 * @author Georg Fischer
 */
public class A258779 extends EulerTransform {

  /** Construct the sequence. */
  public A258779() {
    super(new PeriodicSequence(2, -8, 2, -4), 1);
  }
}
