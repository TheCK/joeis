package irvine.oeis.a174;
// Generated by gen_seq4.pl holos [0,1,7,-1,1] [0,1,1,-7] 0 at 2019-12-17 15:30
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A174792 Expansion of x*(1 - x^2)/(1 - x + 7*x^2 + x^3).
 * @author Georg Fischer
 */
public class A174792 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A174792() {
    super(1, "[0,1,7,-1,1]", "[0,1,1,-7]", 0);
  }
}
