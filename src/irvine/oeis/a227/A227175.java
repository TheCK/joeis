package irvine.oeis.a227;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A227175 Expansion of (phi(x) / f(-x^4))^4 in powers of x where phi(), f() are Ramanujan theta functions.
 * @author Georg Fischer
 */
public class A227175 extends EulerTransform {

  /** Construct the sequence. */
  public A227175() {
    super(new PeriodicSequence(8, -12, 8, 0), 1);
  }
}
