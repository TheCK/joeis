package irvine.oeis.a258;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A258741 Expansion of f(x^3, x^5) / f(x, x^3) in powers of x where f(, ) is Ramanujan's general theta function.
 * @author Georg Fischer
 */
public class A258741 extends EulerTransform {

  /** Construct the sequence. */
  public A258741() {
    super(new PeriodicSequence(-1, 1, 0, 1, 0, 0, -1, 0, -1, 0, 0, 1, 0, 1, -1, 0), 1);
  }
}
