package irvine.oeis.a257;
// Generated by gen_seq4.pl holos [[0],[15,-3],[31,-5],[-16,8],[-8,4],[1,-5],[1,1]] [0,0,1,3,10,30] 0 at 2020-02-15 22:07
// Recurrence: +(n+1)*a[n+0]+(-5*n+1)*a[n-1]+4*(n-2)*a[n-2]+8*(n-2)*a[n-3]+(-5*n+31)*a[n-4]+3*(-n+5)*a[n-5]=0
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A257596 G.f.: (1-x)*(1-2*x-x^2-(1-x)*sqrt(1-2*x-3*x^2))/(2*x*(1-2*x-x^2)).
 * @author Georg Fischer
 */
public class A257596 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A257596() {
    super(1, "[[0],[15,-3],[31,-5],[-16,8],[-8,4],[1,-5],[1,1]]", "[0,0,1,3,10,30]", 0);
  }
}
