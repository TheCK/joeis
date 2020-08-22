package irvine.oeis.a279;
// Generated by gen_seq4.pl holos [[0],[20,-8],[-26,14],[6,-7],[0,1]] [1,1,2,6,21] 0 at 2020-03-14 22:45
// Recurrence: n*a[n+0]+(-7*n+6)*a[n-1]+2*(7*n-13)*a[n-2]+4*(-2*n+5)*a[n-3]=0
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A279561 Number of length n inversion sequences avoiding the patterns 101, 102, 201, and 210.
 * @author Georg Fischer
 */
public class A279561 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A279561() {
    super(0, "[[0],[20,-8],[-26,14],[6,-7],[0,1]]", "[1,1,2,6,21]", 0);
  }
}
