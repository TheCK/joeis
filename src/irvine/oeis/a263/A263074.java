package irvine.oeis.a263;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A263074 Expansion of phi(-x) / (chi(-x^3) * chi(-x^5)) in powers of x where phi(), chi() are Ramanujan theta functions.
 * @author Georg Fischer
 */
public class A263074 extends EulerTransform {

  /** Construct the sequence. */
  public A263074() {
    super(new PeriodicSequence(-2, -1, -1, -1, -1, -1, -2, -1, -1, -1, -2, -1, -2, -1, 0, -1, -2, -1, -2, -1, -1, -1, -2, -1, -1, -1, -1, -1, -2, -1), 1);
  }
}
