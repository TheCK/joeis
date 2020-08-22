package irvine.oeis.a208;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A208955 Expansion of phi(x) * phi(x^9) / chi(x^3)^2 in powers of x where phi(), chi() are Ramanujan theta functions.
 * @author Georg Fischer
 */
public class A208955 extends EulerTransform {

  /** Construct the sequence. */
  public A208955() {
    super(new PeriodicSequence(2, -3, 0, -1, 2, -1, 2, -1, 2, -3, 2, -1, 2, -3, 0, -1, 2, -4, 2, -1, 0, -3, 2, -1, 2, -3, 2, -1, 2, -1, 2, -1, 0, -3, 2, -2), 1);
  }
}
