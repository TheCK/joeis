package irvine.oeis.a097;
// Generated by gen_seq4.pl holos [[0],[2,-3,1],[2,-3,1],[1,-2],[1]] [0,0,1,4,22] 0 at 2020-03-14 22:45
// Recurrence: a[n+0]=(2*n-1)*a[n-1]-(n-2)*(n-1)*a[n-2]-(n-2)*(n-1)*a[n-3]
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A097593 Number of increasing runs of even length in all permutations of [n].
 * @author Georg Fischer
 */
public class A097593 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A097593() {
    super(0, "[[0],[2,-3,1],[2,-3,1],[1,-2],[1]]", "[0,0,1,4,22]", 0);
  }
}
