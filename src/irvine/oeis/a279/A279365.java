package irvine.oeis.a279;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A279365 Expansion of phi(-x)^2 / chi(-x^5) in powers of x where psi(), chi() are Ramanujan theta functions.
 * @author Georg Fischer
 */
public class A279365 extends EulerTransform {

  /** Construct the sequence. */
  public A279365() {
    super(new PeriodicSequence(-4, -2, -4, -2, -3, -2, -4, -2, -4, -2), 1);
  }
}
