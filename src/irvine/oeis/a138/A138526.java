package irvine.oeis.a138;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A138526 Expansion of phi(-q^5) / phi(-q) in powers of q where phi() is a Ramanujan theta function.
 * @author Georg Fischer
 */
public class A138526 extends EulerTransform {

  /** Construct the sequence. */
  public A138526() {
    super(new PeriodicSequence(2, 1, 2, 1, 0, 1, 2, 1, 2, 0), 1);
  }
}
