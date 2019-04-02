package irvine.oeis.a192;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A192237 a(n) = 2*(a(n-1) + a(n-2) + a(n-3)) - a(n-4) for n &gt;= 4, with initial terms 0,0,0,1. 
 * @author Georg Fischer
 */
public class A192237 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192237() {
    super(new long[] {-1L, 2L, 2L, 2L}, new long[] {0L, 0L, 0L, 1L});
  } // constructor()
} // A192237
