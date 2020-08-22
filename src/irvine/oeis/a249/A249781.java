package irvine.oeis.a249;
// Generated by gen_seq4.pl eulerxfm 1 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A249781 Expansion of q * f(-q)^2 * f(-q^15)^2 * chi(-q) * chi(-q^15) / (chi(-q^3) * chi(-q^5)) in powers of q where f(), chi() are Ramanujan theta functions.
 * @author Georg Fischer
 */
public class A249781 extends EulerTransform {

  /** Construct the sequence. */
  public A249781() {
    super(new PeriodicSequence(-3, -2, -2, -2, -2, -2, -3, -2, -2, -2, -3, -2, -3, -2, -4, -2, -3, -2, -3, -2, -2, -2, -3, -2, -2, -2, -2, -2, -3, -4), 1);
  }
}
