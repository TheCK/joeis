package irvine.oeis.a193;
// Generated by gen_seq4.pl eulerxfm -1 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A193557 Expansion of (1/q) * chi(-q) * chi(-q^3) * chi(-q^6)^4 / chi(q)^4 in powers of q where chi() is a Ramanujan theta function.
 * @author Georg Fischer
 */
public class A193557 extends EulerTransform {

  /** Construct the sequence. */
  public A193557() {
    super(new PeriodicSequence(-5, 4, -6, 0, -5, 0, -5, 0, -6, 4, -5, 0), 1);
  }
}
