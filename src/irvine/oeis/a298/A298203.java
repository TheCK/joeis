package irvine.oeis.a298;
// Generated by gen_seq4.pl eulerxfm -1 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A298203 Expansion of (1/q) * phi(-q) * phi(q^5) / (f(-q^4) * f(-q^20)) in powers of q where phi(), f() are Ramanujan theta functions.
 * @author Georg Fischer
 */
public class A298203 extends EulerTransform {

  /** Construct the sequence. */
  public A298203() {
    super(new PeriodicSequence(-2, -1, -2, 0, 0, -1, -2, 0, -2, -4, -2, 0, -2, -1, 0, 0, -2, -1, -2, 0), 1);
  }
}
