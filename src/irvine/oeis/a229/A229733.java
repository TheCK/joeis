package irvine.oeis.a229;
// Generated by gen_seq4.pl holos [[0],[16,-4],[-10,4],[3,-3],[-1,-2],[2,1]] [1,1,2,2,6,10] 0 at 2020-02-15 22:07
// Recurrence: (n+2)*a[n+0]-(2*n+1)*a[n-1]-3*(n-1)*a[n-2]+2*(2*n-5)*a[n-3]-4*(n-4)*a[n-4]=0
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A229733 Expansion of (1-x+2*x^3-sqrt(1-2*x-3*x^2+4*x^3-4*x^4))/(2*x^2).
 * @author Georg Fischer
 */
public class A229733 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A229733() {
    super(0, "[[0],[16,-4],[-10,4],[3,-3],[-1,-2],[2,1]]", "[1,1,2,2,6,10]", 0);
  }
}
