package irvine.oeis.a259;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A259743 Expansion of f(-x)^3 * psi(x^4) in powers of x where psi(), f() are Ramanujan theta functions.
 * @author Georg Fischer
 */
public class A259743 extends EulerTransform {

  /** Construct the sequence. */
  public A259743() {
    super(new PeriodicSequence(-3, -3, -3, -2, -3, -3, -3, -4), 1);
  }
}
