package irvine.oeis.a169;
// Generated by gen_seq4.pl holos at 2021-06-06 21:33
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A169825 Multiples of 420.
 * Recurrence: a(n)=420*n
 * @author Georg Fischer
 */
public class A169825 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A169825() {
    super(0, "[[0],[0,-1],[-1, 1]]", "0, 420", 0);
  }
}
