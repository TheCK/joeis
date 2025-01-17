package irvine.oeis.a185;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A185220 Expansion of phi(x^3) * psi(x)^2 / chi(-x) in powers of x where phi(), psi(), chi() are Ramanujan theta functions.
 * @author Georg Fischer
 */
public class A185220 extends EulerTransform {

  /** Construct the sequence. */
  public A185220() {
    super(new PeriodicSequence(3, -2, 1, -2, 3, -3), 1);
  }
}
