package irvine.oeis.a328;
// Generated by gen_seq4.pl holos [[0],[-1],[-1],[0],[0],[1],[1]] [2,4,-2,6,-3,9] 0 at 2020-03-14 22:45
// Recurrence: a[n+0]=-a[n-1]+a[n-4]+a[n-5]
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A328985 First differences of A328984.
 * @author Georg Fischer
 */
public class A328985 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A328985() {
    super(1, "[[0],[-1],[-1],[0],[0],[1],[1]]", "[2,4,-2,6,-3,9]", 0);
  }
}
