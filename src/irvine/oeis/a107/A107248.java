package irvine.oeis.a107;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A107248 a(n) = 4*a(n-2) - 4*a(n-4) + 25*a(n-6). 
 * @author Georg Fischer
 */
public class A107248 extends LinearRecurrence {

  /** Construct the sequence. */
  public A107248() {
    super(new long[] {25L, 0L, -4L, 0L, 4L, 0L}, new long[] {1L, 1L, 1L, 37L, 37L, 169L});
  } // constructor()
} // A107248
