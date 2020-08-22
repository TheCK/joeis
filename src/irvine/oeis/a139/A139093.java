package irvine.oeis.a139;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A139093 Expansion of phi(q) * phi(-q^2) in powers of q where phi() is a Ramanujan theta function.
 * @author Georg Fischer
 */
public class A139093 extends EulerTransform {

  /** Construct the sequence. */
  public A139093() {
    super(new PeriodicSequence(2, -5, 2, -2), 1);
  }
}
