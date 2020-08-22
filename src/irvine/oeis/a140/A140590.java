package irvine.oeis.a140;
// Generated by gen_seq4.pl holos [[0],[4],[-4],[-1],[1]] [3,2,9,5,33] 0 at 2020-03-14 22:45
// Recurrence: a[n+0]=a[n-1]+4*a[n-2]-4*a[n-3]
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A140590 Exchange successive pairs of terms of A000051.
 * @author Georg Fischer
 */
public class A140590 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A140590() {
    super(0, "[[0],[4],[-4],[-1],[1]]", "[3,2,9,5,33]", 0);
  }
}
