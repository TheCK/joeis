package irvine.oeis.a210;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A210698 Number of 2 X 2 matrices having all terms in {1,...,n} and determinant = 0 (mod 3). 
 * @author Georg Fischer
 */
public class A210698 extends LinearRecurrence {

  /** Construct the sequence. */
  public A210698() {
    super(new long[] {1L, -1L, 0L, -4L, 4L, 0L, 6L, -6L, 0L, -4L, 4L, 0L, 1L}, new long[] {1L, 8L, 33L, 90L, 209L, 528L, 889L, 1432L, 2673L, 3802L, 5297L, 8448L, 11025L});
  } // constructor()
} // A210698
