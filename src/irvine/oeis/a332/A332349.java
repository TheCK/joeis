package irvine.oeis.a332;
// Generated by gen_seq4.pl holos [[0],[6],[3],[-6],[4],[-3],[-4],[-1],[1]] [1,3,12,22,79,194,537,1519,4011] 0 at 2020-03-14 22:45
// Recurrence: a[n+0]=a[n-1]+4*a[n-2]+3*a[n-3]-4*a[n-4]+6*a[n-5]-3*a[n-6]-6*a[n-7]
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A332349 Number of maximal independent sets in the 4 X n king graph.
 * @author Georg Fischer
 */
public class A332349 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A332349() {
    super(0, "[[0],[6],[3],[-6],[4],[-3],[-4],[-1],[1]]", "[1,3,12,22,79,194,537,1519,4011]", 0);
  }
}
