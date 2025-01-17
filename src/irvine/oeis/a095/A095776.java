package irvine.oeis.a095;
// Generated by gen_seq4.pl holos [[0],[54,-27],[0],[6,-9],[0,1]] [1,3,18,135] 0 at 2020-02-15 22:07
// Recurrence: n*a[n+0]-3*(3*n-2)*a[n-1]-27*(n-2)*a[n-3]=0
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A095776 Expansion of (1-9x-27x^3)^(-1/3).
 * @author Georg Fischer
 */
public class A095776 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A095776() {
    super(0, "[[0],[54,-27],[0],[6,-9],[0,1]]", "[1,3,18,135]", 0);
  }
}
