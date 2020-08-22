package irvine.oeis.a038;
// Generated by gen_seq4.pl holos [[0],[-1,1],[-1,-1],[1]] [2,3,7] 0 at 2020-02-15 22:07
// Recurrence: a[n+0]+(-n-1)*a[n-1]+(n-1)*a[n-2]=0
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A038159 a(n) = n*a(n-1) + 1, a(0) = 2.
 * @author Georg Fischer
 */
public class A038159 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A038159() {
    super(0, "[[0],[-1,1],[-1,-1],[1]]", "[2,3,7]", 0);
  }
}
