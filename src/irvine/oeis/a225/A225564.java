package irvine.oeis.a225;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A225564 Expansion of psi(-x)^2 * f(-x^4)^6 in powers of x where psi(), f() are Ramanujan theta functions.
 * @author Georg Fischer
 */
public class A225564 extends EulerTransform {

  /** Construct the sequence. */
  public A225564() {
    super(new PeriodicSequence(-2, 0, -2, -8), 1);
  }
}
