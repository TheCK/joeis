package irvine.oeis.a263;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A263051 Expansion of f(-x) * f(x^2, x^10) / f(-x^3)^2 in powers of x where f(, ) is Ramanujan's general theta function.
 * @author Georg Fischer
 */
public class A263051 extends EulerTransform {

  /** Construct the sequence. */
  public A263051() {
    super(new PeriodicSequence(-1, 0, 1, -2, -1, 1, -1, -1, 1, 0, -1, 0, -1, 0, 1, -1, -1, 1, -1, -2, 1, 0, -1, 0), 1);
  }
}
