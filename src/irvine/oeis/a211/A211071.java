package irvine.oeis.a211;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A211071 Number of 2 X 2 matrices having all terms in {1,...,n} and determinant = 1 (mod 3). 
 * @author Georg Fischer
 */
public class A211071 extends LinearRecurrence {

  /** Construct the sequence. */
  public A211071() {
    super(new long[] {1L, -1L, 0L, -4L, 4L, 0L, 6L, -6L, 0L, -4L, 4L, 0L, 1L}, new long[] {0L, 4L, 24L, 83L, 208L, 384L, 756L, 1332L, 1944L, 3099L, 4672L, 6144L, 8768L});
  } // constructor()
} // A211071
