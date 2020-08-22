package irvine.oeis.a049;
// Generated by gen_seq4.pl holos at 2020-04-12 21:28
// ogf: (1-25*x)^(2/5)
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A049392 Expansion of (1-25*x)^(2/5).
 * @author Georg Fischer
 */
public class A049392 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A049392() {
    super(0, "[[0],[-10,25],[-1,-1]]", "[1,-10,-75]", 1);
  }
}
