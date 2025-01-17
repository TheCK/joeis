package irvine.oeis.a245;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A245434 Expansion of (phi(x) / phi(x^2)) * (f(-x^3, -x^5) / f(-x^1, -x^7)) in powers of x where phi(), f() are Ramanujan theta functions.
 * @author Georg Fischer
 */
public class A245434 extends EulerTransform {

  /** Construct the sequence. */
  public A245434() {
    super(new PeriodicSequence(3, -5, 1, 2, 1, -5, 3, 0), 1);
  }
}
