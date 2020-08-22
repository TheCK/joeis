package irvine.oeis.a078;
// Generated by gen_seq4.pl holos [[0],[-5,1],[2,-1],[17,-7],[11,-7],[2,-1],[1,1]] [0,1,1,3,7,19] 0 at 2020-02-15 22:07
// Recurrence: (n+1)*a[n+0]+(-n+2)*a[n-1]+(-7*n+11)*a[n-2]+(-7*n+17)*a[n-3]+(-n+2)*a[n-4]+(n-5)*a[n-5]=0
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A078481 Expansion of (1 - x - x^2 - sqrt(1 - 2*x - 5*x^2 - 2*x^3 + x^4)) / (2*x + 2*x^2).
 * @author Georg Fischer
 */
public class A078481 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A078481() {
    super(0, "[[0],[-5,1],[2,-1],[17,-7],[11,-7],[2,-1],[1,1]]", "[0,1,1,3,7,19]", 0);
  }
}
