package irvine.oeis.a214;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A214316 Expansion of psi(x)^2 - 5 * x * psi(x^5)^2 in powers of x where psi() is a Ramanujan theta function.
 * @author Georg Fischer
 */
public class A214316 extends EulerTransform {

  /** Construct the sequence. */
  public A214316() {
    super(new PeriodicSequence(-3, -2, -3, -2, -2, -2, -3, -2, -3, -2), 1);
  }
}
