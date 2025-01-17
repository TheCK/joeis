package irvine.oeis.a259;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A259896 Expansion of psi(x) * psi(x^6) in powers of x where phi() is a Ramanujan theta function.
 * @author Georg Fischer
 */
public class A259896 extends EulerTransform {

  /** Construct the sequence. */
  public A259896() {
    super(new PeriodicSequence(1, -1, 1, -1, 1, 0, 1, -1, 1, -1, 1, -2), 1);
  }
}
