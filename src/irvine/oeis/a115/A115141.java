package irvine.oeis.a115;
// Generated by gen_seq4.pl holos [[0],[6,-4],[0,1]] [1,-2,-1] 0 at 2020-03-14 22:45
// Recurrence: n*a[n+0]+2*(-2*n+3)*a[n-1]=0
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A115141 Convolution of A115140 with itself.
 * @author Georg Fischer
 */
public class A115141 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A115141() {
    super(0, "[[0],[6,-4],[0,1]]", "[1,-2,-1]", 0);
  }
}
