package irvine.oeis.a137;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A137255 a(n) = 2a(n-1) + 4a(n-2) - 6a(n-3) - 3a(n-4). 
 * @author Georg Fischer
 */
public class A137255 extends LinearRecurrence {

  /** Construct the sequence. */
  public A137255() {
    super(new long[] {-3L, -6L, 4L, 2L}, new long[] {1L, 2L, 4L, 8L});
  } // constructor()
} // A137255
