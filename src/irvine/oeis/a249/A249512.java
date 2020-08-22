package irvine.oeis.a249;
// Generated by gen_seq4.pl holos [[0],[-100,20],[-80,20],[10,1],[11,1],[2,-1],[1,-1]] [1,1,3,7,15,33] 0 at 2020-02-15 22:07
// Recurrence: (-n+1)*a[n+0]+(-n+2)*a[n-1]+(n+11)*a[n-2]+(n+10)*a[n-3]+20*(n-4)*a[n-4]+20*(n-5)*a[n-5]=0
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A249512 Expansion of 1/(1-x*sqrt(4*x^2+1)-2*x^2).
 * @author Georg Fischer
 */
public class A249512 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A249512() {
    super(0, "[[0],[-100,20],[-80,20],[10,1],[11,1],[2,-1],[1,-1]]", "[1,1,3,7,15,33]", 0);
  }
}
