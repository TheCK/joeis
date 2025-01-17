package irvine.oeis.a213;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A213617 Expansion of psi(x) * f(-x^3)^3 in powers of x where psi() and f() are Ramanujan theta functions.
 * @author Georg Fischer
 */
public class A213617 extends EulerTransform {

  /** Construct the sequence. */
  public A213617() {
    super(new PeriodicSequence(2, 0, -1, 0, 2, -3), 1);
  }
}
