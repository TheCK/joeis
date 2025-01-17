package irvine.oeis.a156;
// Generated by gen_seq4.pl holos [[0],[6,-3],[3,-6],[1,1]] [1,3,9] 0 at 2020-02-15 22:07
// Recurrence: (n+1)*a[n+0]+3*(-2*n+1)*a[n-1]+3*(-n+2)*a[n-2]=0
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A156016 Expansion of (1-x-sqrt(1-6x-3x^2))/(2x).
 * @author Georg Fischer
 */
public class A156016 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A156016() {
    super(0, "[[0],[6,-3],[3,-6],[1,1]]", "[1,3,9]", 0);
  }
}
