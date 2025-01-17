package irvine.oeis.a257;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A257399 Expansion of phi(x^3) * phi(-x^12) / chi(-x^4) in powers of x where phi(), chi() are Ramanujan theta functions.
 * @author Georg Fischer
 */
public class A257399 extends EulerTransform {

  /** Construct the sequence. */
  public A257399() {
    super(new PeriodicSequence(0, 0, 2, 1, 0, -3, 0, 0, 2, 0, 0, -2, 0, 0, 2, 0, 0, -3, 0, 1, 2, 0, 0, -2), 1);
  }
}
