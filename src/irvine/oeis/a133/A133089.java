package irvine.oeis.a133;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A133089 Expansion of f(x)^3 in powers of x where f() is a Ramanujan theta function.
 * @author Georg Fischer
 */
public class A133089 extends EulerTransform {

  /** Construct the sequence. */
  public A133089() {
    super(new PeriodicSequence(3, -6, 3, -3), 1);
  }
}
