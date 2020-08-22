package irvine.oeis.a262;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A262090 Expansion of f(x^3, x^21) / f(-x^2, -x^4) where f(, ) is the Ramanujan general theta function.
 * @author Georg Fischer
 */
public class A262090 extends EulerTransform {

  /** Construct the sequence. */
  public A262090() {
    super(new PeriodicSequence(0, 1, 1, 1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 0, 0, 0, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 1, 1, 0, 0), 1);
  }
}
