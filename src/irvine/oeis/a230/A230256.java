package irvine.oeis.a230;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A230256 Expansion of f(-x) * psi(x^2) * phi(x^3) / f(-x^3)^3 in powers of x where phi(), psi(), f() are Ramanujan theta functions.
 * @author Georg Fischer
 */
public class A230256 extends EulerTransform {

  /** Construct the sequence. */
  public A230256() {
    super(new PeriodicSequence(-1, 0, 4, -2, -1, 0, -1, -2, 4, 0, -1, 0), 1);
  }
}
