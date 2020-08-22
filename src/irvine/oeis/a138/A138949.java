package irvine.oeis.a138;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A138949 Expansion of (3 * phi(q^3)^2 - phi(q)^2) / 2 in powers of q where phi() is a Ramanujan theta function.
 * @author Georg Fischer
 */
public class A138949 extends EulerTransform {

  /** Construct the sequence. */
  public A138949() {
    super(new PeriodicSequence(-2, -3, 0, -2, -2, -4, -2, -2, 0, -3, -2, -2), 1);
  }
}
