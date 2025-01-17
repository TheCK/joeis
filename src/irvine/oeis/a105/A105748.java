package irvine.oeis.a105;
// Generated by gen_seq4.pl holos [[0],[1],[-2,2],[0,-2],[1]] [1,3,10,47,313] 0 at 2020-03-14 22:45
// Recurrence: a[n+0]=2*n*a[n-1]-(2*n-2)*a[n-2]-a[n-3]
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A105748 Number of ways to use the elements of {1,..,k}, 0&lt;=k&lt;=2n, once each to form a collection of n (possibly empty) sets, each with at most 2 elements.
 * @author Georg Fischer
 */
public class A105748 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A105748() {
    super(0, "[[0],[1],[-2,2],[0,-2],[1]]", "[1,3,10,47,313]", 0);
  }
}
