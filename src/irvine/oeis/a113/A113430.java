package irvine.oeis.a113;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A113430 Expansion of f(-x, -x^2) * f(-x^10, -x^20) / f(-x^2, -x^8) in powers of x where f(, ) is Ramanujan's general theta function.
 * @author Georg Fischer
 */
public class A113430 extends EulerTransform {

  /** Construct the sequence. */
  public A113430() {
    super(new PeriodicSequence(-1, 0, -1, -1, -1, -1, -1, 0, -1, -1), 1);
  }
}
