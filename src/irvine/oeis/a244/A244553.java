package irvine.oeis.a244;
// Generated by gen_seq4.pl eulerxfm 1 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A244553 Expansion of phi(q^2) * (phi(q) - phi(q^2)) / 2 in powers of q where phi() is a Ramanujan theta function.
 * @author Georg Fischer
 */
public class A244553 extends EulerTransform {

  /** Construct the sequence. */
  public A244553() {
    super(new PeriodicSequence(-1, 2, 1, -2, 1, 2, -1, -2), 1);
  }
}
