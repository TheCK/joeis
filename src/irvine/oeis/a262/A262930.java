package irvine.oeis.a262;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A262930 Expansion of (psi(-q) / f(q^3))^2 in powers of q where psi(), f() are Ramanujan theta functions.
 * @author Georg Fischer
 */
public class A262930 extends EulerTransform {

  /** Construct the sequence. */
  public A262930() {
    super(new PeriodicSequence(-2, 0, -4, -2, -2, 4, -2, -2, -4, 0, -2, 0), 1);
  }
}
