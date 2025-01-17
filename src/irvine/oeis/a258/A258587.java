package irvine.oeis.a258;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A258587 Expansion of f(-x, -x) * f(x^2, x^10) in powers of x where f(, ) is Ramanujan's general theta function.
 * @author Georg Fischer
 */
public class A258587 extends EulerTransform {

  /** Construct the sequence. */
  public A258587() {
    super(new PeriodicSequence(-2, 0, -2, -2, -2, -1, -2, -1, -2, 0, -2, -2, -2, 0, -2, -1, -2, -1, -2, -2, -2, 0, -2, -2), 1);
  }
}
