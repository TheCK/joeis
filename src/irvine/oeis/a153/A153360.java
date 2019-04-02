package irvine.oeis.a153;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A153360 Number of zig-zag paths from top to bottom of a rectangle of width 10 with n rows. 
 * @author Georg Fischer
 */
public class A153360 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153360() {
    super(new long[] {1L, -3L, -3L, 4L, 1L}, new long[] {10L, 18L, 34L, 64L, 122L});
  } // constructor()
} // A153360
