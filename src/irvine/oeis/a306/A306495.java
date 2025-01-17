package irvine.oeis.a306;
// Generated by gen_seq4.pl holos [[0],[-2,3,-1],[-2,1,1],[-1,-2],[1]] [1,4,16,74,402] 0 at 2020-03-14 22:45
// Recurrence: a[n+0]=(2*n+1)*a[n-1]-(n+2)*(n-1)*a[n-2]+(n-1)*(n-2)*a[n-3]
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A306495 Expansion of e.g.f. (2-exp(-x))*exp(x)/(x-1)^2.
 * @author Georg Fischer
 */
public class A306495 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A306495() {
    super(0, "[[0],[-2,3,-1],[-2,1,1],[-1,-2],[1]]", "[1,4,16,74,402]", 0);
  }
}
