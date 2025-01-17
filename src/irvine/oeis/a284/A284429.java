package irvine.oeis.a284;
// Generated by gen_seq4.pl holos [[0],[1],[0],[0],[-2],[0],[0],[1]] [2,1,3,5,1,3,8] 0 at 2020-03-14 22:45
// Recurrence: a[n+0]=2*a[n-3]-a[n-6]
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A284429 A quasilinear solution to Hofstadter's Q recurrence.
 * @author Georg Fischer
 */
public class A284429 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A284429() {
    super(1, "[[0],[1],[0],[0],[-2],[0],[0],[1]]", "[2,1,3,5,1,3,8]", 0);
  }
}
