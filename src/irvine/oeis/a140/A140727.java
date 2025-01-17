package irvine.oeis.a140;
// Generated by gen_seq4.pl eulerxfm 1 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A140727 Expansion of (phi(q) * phi(q^15) - phi(q^3) * phi(q^5)) / 2 in powers of q where phi() is a Ramanujan theta function.
 * @author Georg Fischer
 */
public class A140727 extends EulerTransform {

  /** Construct the sequence. */
  public A140727() {
    super(new PeriodicSequence(0, -1, 1, -1, 1, -2, 0, -1, 1, -2, 0, -1, 0, -1, 2, -1, 0, -2, 0, -1, 1, -1, 0, -1, 1, -1, 1, -1, 0, -4, 0, -1, 1, -1, 1, -1, 0, -1, 1, -1, 0, -2, 0, -1, 2, -1, 0, -1, 0, -2, 1, -1, 0, -2, 1, -1, 1, -1, 0, -2), 1);
  }
}
