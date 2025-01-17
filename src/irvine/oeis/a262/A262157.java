package irvine.oeis.a262;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A262157 Expansion of psi(x^3)^3 / (psi(x)^2 * psi(x^2)) in powers of x where psi() is a Ramanujan theta function.
 * @author Georg Fischer
 */
public class A262157 extends EulerTransform {

  /** Construct the sequence. */
  public A262157() {
    super(new PeriodicSequence(-2, 1, 1, 3, -2, -2, -2, 3, 1, 1, -2, 0), 1);
  }
}
