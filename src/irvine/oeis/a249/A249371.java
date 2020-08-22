package irvine.oeis.a249;
// Generated by gen_seq4.pl eulerxfm 3 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A249371 Expansion of q^3 * f(q) * f(-q^4) * f(q^15) * f(-q^60) * chi(-q^3) * chi(-q^5) in powers of q where chi(), f() are Ramanujan theta functions.
 * @author Georg Fischer
 */
public class A249371 extends EulerTransform {

  /** Construct the sequence. */
  public A249371() {
    super(new PeriodicSequence(1, -2, 0, -2, 0, -2, 1, -2, 0, -2, 1, -2, 1, -2, 0, -2, 1, -2, 1, -2, 0, -2, 1, -2, 0, -2, 0, -2, 1, -4), 1);
  }
}
