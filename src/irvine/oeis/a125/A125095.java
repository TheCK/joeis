package irvine.oeis.a125;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A125095 Expansion of phi(-x) * psi(x^4) in powers of x where psi(), phi() are Ramanujan theta functions.
 * @author Georg Fischer
 */
public class A125095 extends EulerTransform {

  /** Construct the sequence. */
  public A125095() {
    super(new PeriodicSequence(-2, -1, -2, 0, -2, -1, -2, -2), 1);
  }
}
