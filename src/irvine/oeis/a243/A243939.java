package irvine.oeis.a243;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A243939 Expansion of f(-q)^10 / f(-q^5)^2 in power of q where f() is a Ramanujan theta function.
 * @author Georg Fischer
 */
public class A243939 extends EulerTransform {

  /** Construct the sequence. */
  public A243939() {
    super(new PeriodicSequence(-10, -10, -10, -10, -8), 1);
  }
}
