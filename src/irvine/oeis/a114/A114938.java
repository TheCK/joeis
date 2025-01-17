package irvine.oeis.a114;
// Generated by gen_seq4.pl holos [[0],[0,1,-1],[0,1,-2],[1]] [1,0,2,30] 0 at 2020-03-14 22:45
// Recurrence: a[n+0]=n*(2*n-1)*a[n-1]+(n-1)*n*a[n-2]
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A114938 Number of permutations of the multiset {1,1,2,2,...,n,n} with no two consecutive terms equal.
 * @author Georg Fischer
 */
public class A114938 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A114938() {
    super(0, "[[0],[0,1,-1],[0,1,-2],[1]]", "[1,0,2,30]", 0);
  }
}
