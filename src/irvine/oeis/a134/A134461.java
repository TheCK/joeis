package irvine.oeis.a134;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A134461 Expansion of (phi(x) * psi(-x))^4 in powers of x where phi(), psi() are Ramanujan theta functions.
 * @author Georg Fischer
 */
public class A134461 extends EulerTransform {

  /** Construct the sequence. */
  public A134461() {
    super(new PeriodicSequence(4, -12, 4, -8), 1);
  }
}
