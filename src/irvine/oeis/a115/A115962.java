package irvine.oeis.a115;
// Generated by gen_seq4.pl holos [[0],[6,-4],[4,-4],[0],[0,1]] [1,0,2,2] 0 at 2020-02-15 22:07
// Recurrence: n*a[n+0]-4*(n-1)*a[n-2]-2*(2*n-3)*a[n-3]=0
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A115962 Expansion of 1/sqrt(1-4*x^2-4*x^3).
 * @author Georg Fischer
 */
public class A115962 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A115962() {
    super(0, "[[0],[6,-4],[4,-4],[0],[0,1]]", "[1,0,2,2]", 0);
  }
}
