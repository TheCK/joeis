package irvine.oeis.a299;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A299102 Number of (n + 1, n + 2)-core partitions with odd parts and corresponding order ideals confined to the three outermost diagonals of P_{n + 1, n + 2}. 
 * @author Georg Fischer
 */
public class A299102 extends LinearRecurrence {

  /** Construct the sequence. */
  public A299102() {
    super(new long[] {1L, 1L, -5L, -6L, 12L, 11L, -15L, -6L, 7L, 1L}, new long[] {1L, 2L, 4L, 7L, 17L, 31L, 76L, 144L, 344L, 670L});
  } // constructor()
} // A299102
