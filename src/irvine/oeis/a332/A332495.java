package irvine.oeis.a332;
// Generated by gen_seq4.pl holos [[0],[-1],[3],[-4],[4],[-3],[1]] [0,2,7,15,25,37,52] 0 at 2020-03-14 22:45
// Recurrence: a[n+0]=3*a[n-1]-4*a[n-2]+4*a[n-3]-3*a[n-4]+a[n-5]
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A332495 a(n-2) = a(n-6) + 5*(1+2*n) with a(0)=0, a(1)=2, a(2)=7, a(3)=15 for n&gt;=4.
 * @author Georg Fischer
 */
public class A332495 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A332495() {
    super(0, "[[0],[-1],[3],[-4],[4],[-3],[1]]", "[0,2,7,15,25,37,52]", 0);
  }
}
