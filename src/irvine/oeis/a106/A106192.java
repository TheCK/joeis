package irvine.oeis.a106;
// Generated by gen_seq4.pl holos [[0],[-6,4],[0,-1],[6,-4],[0,1]] [1,-2,-1,-6] 0 at 2020-02-15 22:07
// Recurrence: n*a[n+0]+2*(-2*n+3)*a[n-1]-n*a[n-2]+2*(2*n-3)*a[n-3]=0
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A106192 Expansion of sqrt(1-4x)/(1-x^2).
 * @author Georg Fischer
 */
public class A106192 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A106192() {
    super(0, "[[0],[-6,4],[0,-1],[6,-4],[0,1]]", "[1,-2,-1,-6]", 0);
  }
}
