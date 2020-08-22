package irvine.oeis.a332;
// Generated by gen_seq4.pl holos [[0],[-1],[0],[-2],[1]] [3,2,4,11] 0 at 2020-03-14 22:45
// Recurrence: a[n+0]=2*a[n-1]+a[n-3]
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A332647 a(n) = 2*a(n-1) + a(n-3) with a(0) = 3, a(1) = 2, a(2) = 4.
 * @author Georg Fischer
 */
public class A332647 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A332647() {
    super(0, "[[0],[-1],[0],[-2],[1]]", "[3,2,4,11]", 0);
  }
}
