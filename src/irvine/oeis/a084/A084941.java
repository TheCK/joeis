package irvine.oeis.a084;
// Generated by gen_seq4.pl holos [[0],[0,2,-3],[1]] [1,1,8] 0 at 2020-03-14 22:45
// Recurrence: a[n+0]=n*(3*n-2)*a[n-1]
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A084941 Octagorials: n-th polygorial for k=8.
 * @author Georg Fischer
 */
public class A084941 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A084941() {
    super(0, "[[0],[0,2,-3],[1]]", "[1,1,8]", 0);
  }
}
