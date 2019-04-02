package irvine.oeis.a271;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A271911 Number of ways to choose three distinct points from a 2 X n grid so that they form an isosceles triangle. 
 * @author Georg Fischer
 */
public class A271911 extends LinearRecurrence {

  /** Construct the sequence. */
  public A271911() {
    super(new long[] {1L, -2L, 0L, 2L}, new long[] {0L, 4L, 10L, 16L});
  } // constructor()
} // A271911
