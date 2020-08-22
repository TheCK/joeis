package irvine.oeis.a173;
// Generated by gen_seq4.pl holos [0,-1,1,-7,-6,8,17,-3,-9,0,1] [0,0,0,1,4,8,33,68,245] 0 at 2019-12-17 15:30
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A173652 Expansion of g.f.: x^3*(1 + 4*x - x^2 - 6*x^3 + x^4)/(1 - 9*x^2 - 3*x^3 + 17*x^4 + 8*x^5 - 6*x^6 - 7*x^7 + x^8 - x^9).
 * @author Georg Fischer
 */
public class A173652 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A173652() {
    super(1, "[0,-1,1,-7,-6,8,17,-3,-9,0,1]", "[0,0,0,1,4,8,33,68,245]", 0);
  }
}
