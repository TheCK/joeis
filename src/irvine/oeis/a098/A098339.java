package irvine.oeis.a098;
// Generated by gen_seq4.pl holos [[0],[-17,17],[3,-6],[0,1]] [1,3,5] 0 at 2020-02-15 22:07
// Recurrence: n*a[n+0]+3*(1-2*n)*a[n-1]+17*(n-1)*a[n-2]=0
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A098339 Expansion of 1/sqrt(1 - 6x + 17x^2).
 * @author Georg Fischer
 */
public class A098339 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A098339() {
    super(0, "[[0],[-17,17],[3,-6],[0,1]]", "[1,3,5]", 0);
  }
}
