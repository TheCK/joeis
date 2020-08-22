package irvine.oeis.a170;
// Generated by gen_seq4.pl holos [[0,0,0,0,0,0,0,0,0,0,-1,0,0,0,0,0,0,0,-1],[2]] [0,1] 0 at 2020-03-14 22:45
// Recurrence: 2*a[n+0]=n^10*(n^8+1)
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A170800 a(n) = n^10*(n^8 + 1)/2.
 * @author Georg Fischer
 */
public class A170800 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A170800() {
    super(0, "[[0,0,0,0,0,0,0,0,0,0,-1,0,0,0,0,0,0,0,-1],[2]]", "[0,1]", 0);
  }
}
