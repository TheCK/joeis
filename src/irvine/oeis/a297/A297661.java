package irvine.oeis.a297;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A297661 a(n) = n + 2*cos((n*Pi)/3) + Lucas(n). 
 * @author Georg Fischer
 */
public class A297661 extends LinearRecurrence {

  /** Construct the sequence. */
  public A297661() {
    super(new long[] {1L, -2L, 0L, 4L, -6L, 4L}, new long[] {3L, 4L, 5L, 10L, 17L, 26L});
  } // constructor()
} // A297661
