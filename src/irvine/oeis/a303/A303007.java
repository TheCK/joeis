package irvine.oeis.a303;
// Generated by gen_seq4.pl holos [[0],[270,-240],[0,1]] [1,-30] 0 at 2020-02-15 22:07
// Recurrence: n*a[n+0]+30*(-8*n+9)*a[n-1]=0
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A303007 Expansion of (1-240*x)^(1/8).
 * @author Georg Fischer
 */
public class A303007 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A303007() {
    super(0, "[[0],[270,-240],[0,1]]", "[1,-30]", 0);
  }
}
