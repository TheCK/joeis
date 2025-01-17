package irvine.oeis.a132;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A132002 Expansion of phi(q^3) / phi(q) in powers of q where phi() is a Ramanujan theta function.
 * @author Georg Fischer
 */
public class A132002 extends EulerTransform {

  /** Construct the sequence. */
  public A132002() {
    super(new PeriodicSequence(-2, 3, 0, 1, -2, 0, -2, 1, 0, 3, -2, 0), 1);
  }
}
