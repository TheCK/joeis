package irvine.oeis.a084;
// Generated by gen_seq4.pl holos [[0],[-1,1],[7,-14],[0,1]] [1,7,73] 0 at 2020-02-15 22:07
// Recurrence: n*a[n+0]+7*(1-2*n)*a[n-1]+(n-1)*a[n-2]=0
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A084768 P_n(7), where P_n is n-th Legendre polynomial; also, a(n) = central coefficient of (1 + 7*x + 12*x^2)^n.
 * @author Georg Fischer
 */
public class A084768 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A084768() {
    super(0, "[[0],[-1,1],[7,-14],[0,1]]", "[1,7,73]", 0);
  }
}
