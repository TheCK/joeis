package irvine.oeis.a293;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A293990 a(n) = (3*n + ((n-2) mod 4))/2. 
 * @author Georg Fischer
 */
public class A293990 extends LinearRecurrence {

  /** Construct the sequence. */
  public A293990() {
    super(new long[] {-1L, 1L, 0L, 0L, 1L}, new long[] {1L, 3L, 3L, 5L, 7L});
  } // constructor()
} // A293990
