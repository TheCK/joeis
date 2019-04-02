package irvine.oeis.a293;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A293608 a(n) = (3*n + 7)*Pochhammer(n, 5) / 4!. 
 * @author Georg Fischer
 */
public class A293608 extends LinearRecurrence {

  /** Construct the sequence. */
  public A293608() {
    super(new long[] {1L, -7L, 21L, -35L, 35L, -21L, 7L}, new long[] {0L, 50L, 390L, 1680L, 5320L, 13860L, 31500L});
  } // constructor()
} // A293608
