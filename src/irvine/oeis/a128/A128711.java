package irvine.oeis.a128;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A128711 Expansion of phi(x) * psi(x^4) * phi(-x^4)^4 in powers of x where phi(), psi() are Ramanujan theta functions.
 * @author Georg Fischer
 */
public class A128711 extends EulerTransform {

  /** Construct the sequence. */
  public A128711() {
    super(new PeriodicSequence(2, -3, 2, -8, 2, -3, 2, -6), 1);
  }
}
