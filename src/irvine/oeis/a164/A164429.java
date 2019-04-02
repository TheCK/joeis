package irvine.oeis.a164;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A164429 Number of binary strings of length n with no substrings equal to 0000, 0011, or 1011. 
 * @author Georg Fischer
 */
public class A164429 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164429() {
    super(new long[] {-1L, 1L, -1L, 2L}, new long[] {13L, 21L, 33L, 50L});
  } // constructor()
} // A164429
