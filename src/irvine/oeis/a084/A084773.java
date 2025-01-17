package irvine.oeis.a084;
// Generated by gen_seq4.pl holos [[0],[-4,4],[6,-12],[0,1]] [1,6,52] 0 at 2020-02-15 22:07
// Recurrence: n*a[n+0]+6*(-2*n+1)*a[n-1]+4*(n-1)*a[n-2]=0
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A084773 Coefficients of 1/sqrt(1-12*x+4*x^2); also, a(n) is the central coefficient of (1+6x+8x^2)^n.
 * @author Georg Fischer
 */
public class A084773 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A084773() {
    super(0, "[[0],[-4,4],[6,-12],[0,1]]", "[1,6,52]", 0);
  }
}
