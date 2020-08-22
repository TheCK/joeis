package irvine.oeis.a226;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A226559 Expansion of f(-x^1, -x^7) * f(-x^2, -x^6) / (f(-x^3, -x^5) * f(-x^4, -x^4)) in powers of x where f(, ) is Ramanujan's general theta function.
 * @author Georg Fischer
 */
public class A226559 extends EulerTransform {

  /** Construct the sequence. */
  public A226559() {
    super(new PeriodicSequence(-1, -1, 1, 2, 1, -1, -1, 0), 1);
  }
}
