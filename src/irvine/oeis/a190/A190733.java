package irvine.oeis.a190;
// Generated by gen_seq4.pl holos [[0],[32,-8],[60,-20],[28,-14],[1,-1],[1,1]] [1,3,5,15,49] 0 at 2020-02-15 22:07
// Recurrence: (n+1)*a[n+0]+(-n+1)*a[n-1]+14*(-n+2)*a[n-2]+20*(-n+3)*a[n-3]+8*(-n+4)*a[n-4]=0
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A190733 Expansion of (4*x+2)/(1+sqrt(1-4*x-4*x^2)).
 * @author Georg Fischer
 */
public class A190733 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A190733() {
    super(0, "[[0],[32,-8],[60,-20],[28,-14],[1,-1],[1,1]]", "[1,3,5,15,49]", 0);
  }
}
