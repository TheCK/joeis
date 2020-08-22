package irvine.oeis.a269;
// Generated by gen_seq4.pl holos [[-1,0,0,0,0,-1,0,0,0,0,-1,0,0,0,0,-1,0,0,0,0,-1],[1]] [1,5] 0 at 2020-03-14 22:45
// Recurrence: a[n+0]=n^20+n^15+n^10+n^5+1
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A269527 a(n) = n^20 + n^15 + n^10 + n^5 + 1.
 * @author Georg Fischer
 */
public class A269527 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A269527() {
    super(0, "[[-1,0,0,0,0,-1,0,0,0,0,-1,0,0,0,0,-1,0,0,0,0,-1],[1]]", "[1,5]", 0);
  }
}
