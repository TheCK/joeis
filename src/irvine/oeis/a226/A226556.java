package irvine.oeis.a226;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A226556 Expansion of f(x, -x^4) / f(-x^2, x^3) in powers of x where f(,) is Ramanujan's general theta function.
 * @author Georg Fischer
 */
public class A226556 extends EulerTransform {

  /** Construct the sequence. */
  public A226556() {
    super(new PeriodicSequence(1, 0, -1, -1, 0, 0, -1, 1, 1, 0, 1, 1, -1, 0, 0, -1, -1, 0, 1, 0), 1);
  }
}
