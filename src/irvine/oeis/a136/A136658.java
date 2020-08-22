package irvine.oeis.a136;
// Generated by gen_seq4.pl holos [[0],[6,-11,6,-1],[6,-9,3],[1,-3],[1]] [1,2,10,68,580] 0 at 2020-03-14 22:45
// Recurrence: a[n+0]=(3*n-1)*a[n-1]-3*(n-2)*(n-1)*a[n-2]+(n-3)*(n-2)*(n-1)*a[n-3]
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A136658 Row sums of unsigned triangle A136656 and also of triangle 2*A136657.
 * @author Georg Fischer
 */
public class A136658 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A136658() {
    super(0, "[[0],[6,-11,6,-1],[6,-9,3],[1,-3],[1]]", "[1,2,10,68,580]", 0);
  }
}
