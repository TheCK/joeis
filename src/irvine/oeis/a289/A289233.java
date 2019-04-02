package irvine.oeis.a289;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A289233 Largest number of disjoint point triples that can be chosen from an n X n X n triangular point grid, each point triple forming a 2 X 2 X 2 triangle. 
 * @author Georg Fischer
 */
public class A289233 extends LinearRecurrence {

  /** Construct the sequence. */
  public A289233() {
    super(new long[] {1L, -2L, 0L, 1L, 2L, -2L, -1L, 0L, 2L}, new long[] {0L, 1L, 1L, 3L, 4L, 6L, 9L, 11L, 15L});
  } // constructor()
} // A289233
