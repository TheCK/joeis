package irvine.oeis.a246;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A246816 Expansion of phi(q) * phi(-q^2) * phi(-q^4) in powers of q where phi() is a Ramanujan theta function.
 * @author Georg Fischer
 */
public class A246816 extends EulerTransform {

  /** Construct the sequence. */
  public A246816() {
    super(new PeriodicSequence(2, -5, 2, -4, 2, -5, 2, -3), 1);
  }
}
