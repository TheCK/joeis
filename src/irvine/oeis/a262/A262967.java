package irvine.oeis.a262;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A262967 Expansion of phi(-q^2) / phi(-q^3) in powers of q where phi() is a Ramanujan theta function.
 * @author Georg Fischer
 */
public class A262967 extends EulerTransform {

  /** Construct the sequence. */
  public A262967() {
    super(new PeriodicSequence(0, -2, 2, -1, 0, -1, 0, -1, 2, -2, 0, 0), 1);
  }
}
