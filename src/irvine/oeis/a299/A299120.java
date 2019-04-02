package irvine.oeis.a299;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A299120 a(n) = (n-1)*(n-2)*(n+3)*(n+2)/12. 
 * @author Georg Fischer
 */
public class A299120 extends LinearRecurrence {

  /** Construct the sequence. */
  public A299120() {
    super(new long[] {1L, -5L, 10L, -10L, 5L}, new long[] {1L, 0L, 0L, 5L, 21L});
  } // constructor()
} // A299120
