package irvine.oeis.a227;
// Generated by gen_seq4.pl eulerxfm 1 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A227454 Expansion of q * (f(q^9) / f(q))^3 in powers of q where f() is a Ramanujan theta function.
 * @author Georg Fischer
 */
public class A227454 extends EulerTransform {

  /** Construct the sequence. */
  public A227454() {
    super(new PeriodicSequence(-3, 6, -3, 3, -3, 6, -3, 3, 0, 6, -3, 3, -3, 6, -3, 3, -3, 0, -3, 3, -3, 6, -3, 3, -3, 6, 0, 3, -3, 6, -3, 3, -3, 6, -3, 0), 1);
  }
}
