package irvine.oeis.a262;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A262368 Expansion of f(x^2, x^2) * f(x, x^2)^2 in powers of x where f(, ) is Ramanujan's general theta function.
 * @author Georg Fischer
 */
public class A262368 extends EulerTransform {

  /** Construct the sequence. */
  public A262368() {
    super(new PeriodicSequence(2, 2, -2, -3, 2, 0, 2, -1, -2, 2, 2, -5, 2, 2, -2, -1, 2, 0, 2, -3, -2, 2, 2, -3), 1);
  }
}
