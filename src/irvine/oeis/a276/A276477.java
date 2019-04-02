package irvine.oeis.a276;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A276477 a(n) = a(n-2) + a(n-3) for n &gt;= 3, with a(0) = a(1) = 2, a(2) = 1. 
 * @author Georg Fischer
 */
public class A276477 extends LinearRecurrence {

  /** Construct the sequence. */
  public A276477() {
    super(new long[] {1L, 1L, 0L}, new long[] {2L, 2L, 1L});
  } // constructor()
} // A276477
