package irvine.oeis.a254;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A254346 Expansion of f(x, x^5) * f(-x^6) / f(x)^2 in powers of x where f() is a Ramanujan theta function.
 * @author Georg Fischer
 */
public class A254346 extends EulerTransform {

  /** Construct the sequence. */
  public A254346() {
    super(new PeriodicSequence(-1, 3, -2, 2, -1, 2, -1, 2, -2, 3, -1, 0), 1);
  }
}
