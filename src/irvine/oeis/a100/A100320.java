package irvine.oeis.a100;
// Generated by gen_seq4.pl holos at 2021-05-09 23:36
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A100320 A Catalan transform of (1 + 2*x)/(1 - 2*x).
 * @author Georg Fischer
 */
public class A100320 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A100320() {
    super(0, "[[0],[2,-4],[0, 1]]", "[1, 4]", 0);
  }
}
