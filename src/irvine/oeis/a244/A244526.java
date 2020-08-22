package irvine.oeis.a244;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A244526 Expansion of f(-x^3, -x^5)^2 in powers of x where f() is Ramanujan's two-variable theta function.
 * @author Georg Fischer
 */
public class A244526 extends EulerTransform {

  /** Construct the sequence. */
  public A244526() {
    super(new PeriodicSequence(0, 0, -2, 0, -2, 0, 0, -2), 1);
  }
}
