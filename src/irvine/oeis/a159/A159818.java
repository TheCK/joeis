package irvine.oeis.a159;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A159818 Expansion of f(q) * f(q^5) in powers of q where f() is a Ramanujan theta function.
 * @author Georg Fischer
 */
public class A159818 extends EulerTransform {

  /** Construct the sequence. */
  public A159818() {
    super(new PeriodicSequence(1, -2, 1, -1, 2, -2, 1, -1, 1, -4, 1, -1, 1, -2, 2, -1, 1, -2, 1, -2), 1);
  }
}
