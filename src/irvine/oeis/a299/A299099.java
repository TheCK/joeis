package irvine.oeis.a299;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A299099 Number of (n + 1, n + 2)-core partitions with odd parts and corresponding order ideals confined to the two outermost diagonals of P_{n + 1, n + 2}. 
 * @author Georg Fischer
 */
public class A299099 extends LinearRecurrence {

  /** Construct the sequence. */
  public A299099() {
    super(new long[] {1L, -1L, -2L, 3L, 1L}, new long[] {1L, 2L, 4L, 7L, 15L});
  } // constructor()
} // A299099
