package irvine.oeis.a204;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A204220 Expansion of f(-x^2, -x^3) * f(-x^2, -x^4) / f(-x, -x^2) in powers of x where f(, ) is Ramanujan's general theta function.
 * @author Georg Fischer
 */
public class A204220 extends EulerTransform {

  /** Construct the sequence. */
  public A204220() {
    super(new PeriodicSequence(1, -1, 0, 0, 0, 0, 0, -1, 1, -1), 1);
  }
}
