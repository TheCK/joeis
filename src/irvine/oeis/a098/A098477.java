package irvine.oeis.a098;
// Generated by gen_seq4.pl holos [[0],[-12,8],[7,-7],[1,-2],[0,1]] [1,1,5,9] 0 at 2020-02-15 22:07
// Recurrence: n*a[n+0]+(1-2*n)*a[n-1]+7*(1-n)*a[n-2]+4*(2*n-3)*a[n-3]=0
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A098477 Expansion of 1/sqrt(1-2*x-7*x^2+8*x^3).
 * @author Georg Fischer
 */
public class A098477 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A098477() {
    super(0, "[[0],[-12,8],[7,-7],[1,-2],[0,1]]", "[1,1,5,9]", 0);
  }
}
