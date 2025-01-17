package irvine.oeis.a232;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A232772 Expansion of (psi(x)^2 / (phi(-x) * phi(x^2)))^2 in powers of x where phi(), psi() are Ramanujan theta functions.
 * @author Georg Fischer
 */
public class A232772 extends EulerTransform {

  /** Construct the sequence. */
  public A232772() {
    super(new PeriodicSequence(8, -6, 8, 4, 8, -6, 8, 0), 1);
  }
}
