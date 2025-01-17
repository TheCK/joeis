package irvine.oeis.a214;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A214303 Expansion of f(-x^2, -x^4) * f(x^1, x^7) in powers of x where f(,) is Ramanujan's two-variable theta function.
 * @author Georg Fischer
 */
public class A214303 extends EulerTransform {

  /** Construct the sequence. */
  public A214303() {
    super(new PeriodicSequence(1, -2, 0, -1, 0, -1, 1, -2, 1, -1, 0, -1, 0, -2, 1, -2), 1);
  }
}
