package irvine.oeis.a131;
// Generated by gen_seq4.pl holos [[0],[-5400,3600],[54,-136],[0,1]] [1,10,190] 0 at 2020-02-15 22:07
// Recurrence: n*a[n+0]+2*(-68*n+27)*a[n-1]+1800*(2*n-3)*a[n-2]=0
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A131521 Expansion of 9/(4 + 5*sqrt(1-36*x)).
 * @author Georg Fischer
 */
public class A131521 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A131521() {
    super(0, "[[0],[-5400,3600],[54,-136],[0,1]]", "[1,10,190]", 0);
  }
}
