package irvine.oeis.a188;
// Generated by gen_seq4.pl holos [[0],[-1,-1],[1]] [1,2,3] 0 at 2020-03-14 22:45
// Recurrence: a[n+0]=(n+1)*a[n-1]
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A188588 Row sums of 1-Euler triangle A188587.
 * @author Georg Fischer
 */
public class A188588 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A188588() {
    super(0, "[[0],[-1,-1],[1]]", "[1,2,3]", 0);
  }
}
