package irvine.oeis.a035;
// Generated by gen_seq4.pl holos [[0],[2,-9],[1]] [1] 0 at 2020-02-15 22:07
// Recurrence: a[n]-(9*n-2)*a[n-1]=0
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A035021 One seventh of 9-factorial numbers.
 * @author Georg Fischer
 */
public class A035021 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A035021() {
    super(1, "[[0],[2,-9],[1]]", "[1]", 0);
  }
}
