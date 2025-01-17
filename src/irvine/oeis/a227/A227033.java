package irvine.oeis.a227;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A227033 Expansion of (phi(x) / f(-x^4))^2 in powers of x where phi(), f() are Ramanujan theta functions.
 * @author Georg Fischer
 */
public class A227033 extends EulerTransform {

  /** Construct the sequence. */
  public A227033() {
    super(new PeriodicSequence(4, -6, 4, 0), 1);
  }
}
