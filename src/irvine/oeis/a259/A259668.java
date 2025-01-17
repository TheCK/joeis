package irvine.oeis.a259;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A259668 Expansion of psi(-x)^2 * psi(x^3)^2 / (phi(-x^4) * psi(-x^6)) in power of x where phi(), psi() are Ramanujan theta functions.
 * @author Georg Fischer
 */
public class A259668 extends EulerTransform {

  /** Construct the sequence. */
  public A259668() {
    super(new PeriodicSequence(-2, 0, 0, 0, -2, -1, -2, -1, 0, 0, -2, -2, -2, 0, 0, -1, -2, -1, -2, 0, 0, 0, -2, -2), 1);
  }
}
