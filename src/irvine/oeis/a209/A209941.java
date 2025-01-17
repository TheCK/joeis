package irvine.oeis.a209;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A209941 Expansion of f(x)^6 in powers of x where f() is a Ramanujan theta function.
 * @author Georg Fischer
 */
public class A209941 extends EulerTransform {

  /** Construct the sequence. */
  public A209941() {
    super(new PeriodicSequence(6, -12, 6, -6), 1);
  }
}
