package irvine.oeis.a225;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A225701 Expansion of chi(q)^5 / chi(q^5) in powers of q where chi() is a Ramanujan theta function.
 * @author Georg Fischer
 */
public class A225701 extends EulerTransform {

  /** Construct the sequence. */
  public A225701() {
    super(new PeriodicSequence(5, -5, 5, 0, 4, -5, 5, 0, 5, -4, 5, 0, 5, -5, 4, 0, 5, -5, 5, 0), 1);
  }
}
