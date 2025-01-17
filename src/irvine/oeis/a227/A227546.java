package irvine.oeis.a227;
// Generated by gen_seq4.pl holos [[0],[1,-3,5,-4,1],[1,5,-8,5,-1],[-7,11,-6,1]] [2,3,7,16] 0 at 2020-03-14 22:45
// Recurrence: (n^3-6*n^2+11*n-7)*a[n+0]-(n^4-5*n^3+8*n^2-5*n-1)*a[n-1]+(n-1)*(n^3-3*n^2+2*n-1)*a[n-2]=0
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A227546 n! + n^2 + 1.
 * @author Georg Fischer
 */
public class A227546 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A227546() {
    super(0, "[[0],[1,-3,5,-4,1],[1,5,-8,5,-1],[-7,11,-6,1]]", "[2,3,7,16]", 0);
  }
}
