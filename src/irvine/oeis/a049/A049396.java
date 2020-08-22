package irvine.oeis.a049;
// Generated by gen_seq4.pl holos at 2020-04-12 21:28
// ogf: (1-25*x)^(-8/5)
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A049396 Expansion of (1-25*x)^(-8/5).
 * @author Georg Fischer
 */
public class A049396 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A049396() {
    super(0, "[[0],[40,25],[-1,-1]]", "[1,40,1300]", 1);
  }
}
