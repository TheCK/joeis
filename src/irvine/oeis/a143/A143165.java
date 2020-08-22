package irvine.oeis.a143;
// Generated by gen_seq4.pl holos [[0],[18,42,32,8],[-1,-8,-4],[-8,-2],[1]] [0,1,6,49,468] 3 at 2020-03-14 22:45
// Recurrence: 2*(n+1)*(3+2*n)^2*a[n+0]-(4*n^2+8*n+1)*a[n+1]-(2*(n+4))*a[n+2]+a[n+3]=0
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A143165 Expansion of the exponential generating function arcsin(2*x)/(2*(1-2*x)^(3/2)).
 * @author Georg Fischer
 */
public class A143165 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A143165() {
    super(0, "[[0],[18,42,32,8],[-1,-8,-4],[-8,-2],[1]]", "[0,1,6,49,468]", 3);
  }
}
