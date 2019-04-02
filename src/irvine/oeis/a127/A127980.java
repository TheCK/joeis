package irvine.oeis.a127;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A127980 a(n) = (n + 2/3)*2^(n-1) - 1/2 - (-1)^(n-1)*(1/6). 
 * @author Georg Fischer
 */
public class A127980 extends LinearRecurrence {

  /** Construct the sequence. */
  public A127980() {
    super(new long[] {4L, -4L, -3L, 4L}, new long[] {1L, 5L, 14L, 37L});
  } // constructor()
} // A127980
