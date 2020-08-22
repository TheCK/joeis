package irvine.oeis.a259;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A259910 Expansion of f(-x^2, -x^3)^3 / f(-x)^2 in powers of x where f(,) is the Ramanujan general theta function.
 * @author Georg Fischer
 */
public class A259910 extends EulerTransform {

  /** Construct the sequence. */
  public A259910() {
    super(new PeriodicSequence(2, -1, -1, 2, -1), 1);
  }
}
