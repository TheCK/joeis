package irvine.oeis.a329;
// Generated by gen_seq4.pl holos [[0],[-1],[1],[2],[-2],[-1],[1]] [1,1,3,7,11,19,25] 0 at 2020-03-14 22:45
// Recurrence: a[n+0]=a[n-1]+2*a[n-2]-2*a[n-3]-a[n-4]+a[n-5]
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A329482 Interleave 1 - n + 3*n^2, 1 + 3*n*(1+n) for n &gt;= 0.
 * @author Georg Fischer
 */
public class A329482 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A329482() {
    super(0, "[[0],[-1],[1],[2],[-2],[-1],[1]]", "[1,1,3,7,11,19,25]", 0);
  }
}
