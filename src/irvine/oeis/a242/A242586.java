package irvine.oeis.a242;
// Generated by gen_seq4.pl holos [[0],[10,-5],[-14,11],[4,-7],[0,1]] [1,2,6,23] 0 at 2020-02-15 22:07
// Recurrence: n*a[n+0]+(-7*n+4)*a[n-1]+(11*n-14)*a[n-2]+5*(-n+2)*a[n-3]=0
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A242586 Expansion of 1/(2*sqrt(1-x))*(1/sqrt(1-x)+1/(sqrt(1-5*x))).
 * @author Georg Fischer
 */
public class A242586 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A242586() {
    super(0, "[[0],[10,-5],[-14,11],[4,-7],[0,1]]", "[1,2,6,23]", 0);
  }
}
