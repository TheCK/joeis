package irvine.oeis.a134;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A134078 Expansion of (phi(-q) / phi(-q^2))^3 * phi(q^3)^5 / phi(-q^6) in powers of q where phi() is a Ramanujan theta function.
 * @author Georg Fischer
 */
public class A134078 extends EulerTransform {

  /** Construct the sequence. */
  public A134078() {
    super(new PeriodicSequence(-6, 3, 4, 0, -6, -10, -6, 0, 4, 3, -6, -4), 1);
  }
}
