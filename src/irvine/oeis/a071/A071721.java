package irvine.oeis.a071;
// Generated by gen_seq4.pl holos [[0],[0,-2,4],[2,-1,-1]] [1,2,6] 0 at 2020-03-14 22:45
// Recurrence: -(n+2)*(n-1)*a[n+0]+2*n*(2*n-1)*a[n-1]=0
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A071721 Expansion of (1+x^2*C^2)*C^2, where C = (1-(1-4*x)^(1/2))/(2*x) is g.f. for Catalan numbers, A000108.
 * @author Georg Fischer
 */
public class A071721 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A071721() {
    super(0, "[[0],[0,-2,4],[2,-1,-1]]", "[1,2,6]", 0);
  }
}
