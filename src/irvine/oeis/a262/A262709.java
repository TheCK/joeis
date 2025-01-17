package irvine.oeis.a262;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A262709 Expansion of f(-x^4, -x^4) * f(-x, -x^5) in powers of x where f(, ) is Ramanujan's general theta function.
 * @author Georg Fischer
 */
public class A262709 extends EulerTransform {

  /** Construct the sequence. */
  public A262709() {
    super(new PeriodicSequence(-1, 0, 0, -2, -1, -1, -1, -1, 0, 0, -1, -3, -1, 0, 0, -1, -1, -1, -1, -2, 0, 0, -1, -2), 1);
  }
}
