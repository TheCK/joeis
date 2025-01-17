package irvine.oeis.a329;
// Generated by gen_seq4.pl holos [[0],[-6,1],[2],[10,-4],[-3,-2],[2],[-2],[5,1]] [1,1,1,3,3,2,5] 0 at 2020-02-15 22:07
// Recurrence: (n+5)*a[n+0]-2*a[n-1]+2*(1)*a[n-2]+(-2*n-3)*a[n-3]+2*(-2*n+5)*a[n-4]+2*a[n-5]+(n-6)*a[n-6]=0
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A329690 Number of excursions of length n with Motzkin-steps avoiding the consecutive steps UU, HH, DU and DD.
 * @author Georg Fischer
 */
public class A329690 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A329690() {
    super(0, "[[0],[-6,1],[2],[10,-4],[-3,-2],[2],[-2],[5,1]]", "[1,1,1,3,3,2,5]", 0);
  }
}
