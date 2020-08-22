package irvine.oeis.a201;
// Generated by gen_seq4.pl holos [[0],[-14,4],[-18,7],[10,-2],[4,-4],[0,1]] [-1,-1,0,2,9] 0 at 2020-02-15 22:07
// Recurrence: n*a[n+0]+4*(-n+1)*a[n-1]+2*(-n+5)*a[n-2]+(7*n-18)*a[n-3]+2*(2*n-7)*a[n-4]=0
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A201164 Expansion of g.f. -(1+x)*(1+sqrt(1-4*x))/(2*(1-x-x^2)).
 * @author Georg Fischer
 */
public class A201164 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A201164() {
    super(0, "[[0],[-14,4],[-18,7],[10,-2],[4,-4],[0,1]]", "[-1,-1,0,2,9]", 0);
  }
}
