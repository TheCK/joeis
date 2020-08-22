package irvine.oeis.a034;
// Generated by gen_seq4.pl holos [[0],[0,-10,15,-3],[28,-21,3]] [-8,200] 0 at 2020-03-14 22:45
// Recurrence: (3*n^2-21*n+28)*a[n+0]-n*(3*n^2-15*n+10)*a[n-1]=0
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A034861 a(n) = n!*(3*n^2 - 15*n + 10)/6.
 * @author Georg Fischer
 */
public class A034861 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A034861() {
    super(4, "[[0],[0,-10,15,-3],[28,-21,3]]", "[-8,200]", 0);
  }
}
