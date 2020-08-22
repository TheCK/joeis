package irvine.oeis.a116;
// Generated by gen_seq4.pl holos [[0],[204,-68],[24,-8],[-36,29],[0,2],[0,-3]] [1,1,5,9,33] 0 at 2020-02-15 22:07
// Recurrence: -3*n*a[n+0]+2*n*a[n-1]+(29*n-36)*a[n-2]+8*(3-n)*a[n-3]+68*(3-n)*a[n-4]=0
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A116390 Expansion of 1/(2*sqrt(1-4*x^2)-x-1).
 * @author Georg Fischer
 */
public class A116390 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A116390() {
    super(0, "[[0],[204,-68],[24,-8],[-36,29],[0,2],[0,-3]]", "[1,1,5,9,33]", 0);
  }
}
