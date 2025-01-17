package irvine.oeis.a036;
// Generated by gen_seq4.pl holos [[0],[-1],[0,0,-1],[1]] [1,4,37] 0 at 2020-03-14 22:45
// Recurrence: a[n+0]=n^2*a[n-1]+a[n-2]
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A036245 Numerator of fraction equal to the continued fraction [ 0, 1, 4, ..., n^2 ].
 * @author Georg Fischer
 */
public class A036245 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A036245() {
    super(1, "[[0],[-1],[0,0,-1],[1]]", "[1,4,37]", 0);
  }
}
