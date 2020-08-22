package irvine.oeis.a128;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A128762 Expansion of chi(q) * chi(q^2) / (chi(q^5) * chi(q^10)) in powers of q where chi() is a Ramanujan theta function.
 * @author Georg Fischer
 */
public class A128762 extends EulerTransform {

  /** Construct the sequence. */
  public A128762() {
    super(new PeriodicSequence(1, 0, 1, -1, 0, 0, 1, 0, 1, 0, 1, -1, 1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, -1, 1, 0, 1, 0, 1, 0, 0, -1, 1, 0, 1, 0), 1);
  }
}
