package irvine.oeis.a179;
// Generated by gen_seq4.pl holos [[0],[12,-4],[6,-4],[0,1]] [1,2,4] 0 at 2020-02-15 22:07
// Recurrence: n*a[n+0]+2*(-2*n+3)*a[n-1]+4*(-n+3)*a[n-2]=0
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A179190 Coefficient [x^n] of the Maclaurin series for 2 - sqrt(1 - 4*x - 4*x^2).
 * @author Georg Fischer
 */
public class A179190 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A179190() {
    super(0, "[[0],[12,-4],[6,-4],[0,1]]", "[1,2,4]", 0);
  }
}
