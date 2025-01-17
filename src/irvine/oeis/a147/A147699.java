package irvine.oeis.a147;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A147699 Expansion of f(x) * f(x^5) / phi(-x^10)^2 in powers of x where f(), phi() are Ramanujan theta functions.
 * @author Georg Fischer
 */
public class A147699 extends EulerTransform {

  /** Construct the sequence. */
  public A147699() {
    super(new PeriodicSequence(1, -2, 1, -1, 2, -2, 1, -1, 1, 0, 1, -1, 1, -2, 2, -1, 1, -2, 1, 0), 1);
  }
}
