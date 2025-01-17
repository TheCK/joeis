package irvine.oeis.a212;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A212318 Expansion of phi(q^2)^2 / (phi(-q) * phi(q^4)) in powers of q where phi() is a Ramanujan theta function.
 * @author Georg Fischer
 */
public class A212318 extends EulerTransform {

  /** Construct the sequence. */
  public A212318() {
    super(new PeriodicSequence(2, 5, 2, -7, 2, 5, 2, 2, 2, 5, 2, -7, 2, 5, 2, 0), 1);
  }
}
