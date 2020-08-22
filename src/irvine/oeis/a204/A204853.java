package irvine.oeis.a204;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A204853 Expansion of (3 * phi(-x^36) - phi(-x^4)) / 2 - x * f(-x^24) in powers of x where phi(), f() are Ramanujan theta functions.
 * @author Georg Fischer
 */
public class A204853 extends EulerTransform {

  /** Construct the sequence. */
  public A204853() {
    super(new PeriodicSequence(-1, 0, 0, 1, 1, 1, 1, 0, 0, -1, -1, -2, -1, -1, 0, 0, 1, 1, 1, 1, 0, 0, -1, -1), 1);
  }
}
