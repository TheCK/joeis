package irvine.oeis.a260;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A260164 Expansion of f(-x^8)^2 / f(-x) in powers of x where f() is a Ramanujan theta function.
 * @author Georg Fischer
 */
public class A260164 extends EulerTransform {

  /** Construct the sequence. */
  public A260164() {
    super(new PeriodicSequence(1, 1, 1, 1, 1, 1, 1, -1), 1);
  }
}
