package irvine.oeis.a139;
// Generated by gen_seq4.pl eulerxfm 1 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A139139 Expansion of (phi(q) / phi(q^3) - 1) / 2 in powers of q where phi() is a Ramanujan theta function.
 * @author Georg Fischer
 */
public class A139139 extends EulerTransform {

  /** Construct the sequence. */
  public A139139() {
    super(new PeriodicSequence(0, -1, -1, 0, 1, 2, 1, 0, -1, -1, 0, 0), 1);
  }
}
