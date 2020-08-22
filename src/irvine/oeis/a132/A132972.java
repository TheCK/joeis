package irvine.oeis.a132;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A132972 Expansion of chi(q)^3 / chi(q^3) in powers of q where chi() is a Ramanujan theta function.
 * @author Georg Fischer
 */
public class A132972 extends EulerTransform {

  /** Construct the sequence. */
  public A132972() {
    super(new PeriodicSequence(3, -3, 2, 0, 3, -2, 3, 0, 2, -3, 3, 0), 1);
  }
}
