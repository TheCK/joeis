package irvine.oeis.a108;
// Generated by gen_seq4.pl holos at 2020-04-12 21:28
// ogf: (1-x^2-sqrt(1-2*x^2-4*x^3-3*x^4))/(2*x^3*(1-x^2))
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A108296 Diagonal sums of the number triangle associated to A086617.
 * @author Georg Fischer
 */
public class A108296 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A108296() {
    super(0, "[[0],[36,21,3],[240,100,10],[110,27,1],[-156,-74,-8],[-280,-89,-7],[-112,-30,-2],[162,45,3]]", "[1,1,2,3,5,8,14,24]", 6);
  }
}
