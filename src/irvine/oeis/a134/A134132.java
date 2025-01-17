package irvine.oeis.a134;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A134132 Expansion of chi(-x^3)^2 / (chi(-x) * chi(-x^9)) in power of x where chi() is a Ramanujan theta function.
 * @author Georg Fischer
 */
public class A134132 extends EulerTransform {

  /** Construct the sequence. */
  public A134132() {
    super(new PeriodicSequence(1, 0, -1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, -1, 0, 1, 0), 1);
  }
}
