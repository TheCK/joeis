package irvine.oeis.a246;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A246814 Expansion of phi(-q) * phi(-q^4)^2 in powers of q where phi() is a Ramanujan theta function.
 * @author Georg Fischer
 */
public class A246814 extends EulerTransform {

  /** Construct the sequence. */
  public A246814() {
    super(new PeriodicSequence(-2, -1, -2, -5, -2, -1, -2, -3), 1);
  }
}
