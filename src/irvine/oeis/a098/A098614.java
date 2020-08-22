package irvine.oeis.a098;
// Generated by gen_seq4.pl holos [[0],[-12,32,-16],[0,2,-4],[0,1,1]] [1,1,4,15] 0 at 2020-03-14 22:45
// Recurrence: n*(n+1)*a[n+0]-2*n*(2*n-1)*a[n-1]-4*(2*n-1)*(2*n-3)*a[n-2]=0
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A098614 Product of Fibonacci and Catalan numbers: a(n) = A000045(n+1)*A000108(n).
 * @author Georg Fischer
 */
public class A098614 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A098614() {
    super(0, "[[0],[-12,32,-16],[0,2,-4],[0,1,1]]", "[1,1,4,15]", 0);
  }
}
