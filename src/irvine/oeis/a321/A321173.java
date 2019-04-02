package irvine.oeis.a321;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A321173 a(n) = -2*a(n-1) + a(n-2) + a(n-3), a(0) = -1, a(1) = 3, a(2) = -9. 
 * @author Georg Fischer
 */
public class A321173 extends LinearRecurrence {

  /** Construct the sequence. */
  public A321173() {
    super(new long[] {1L, 1L, -2L}, new long[] {-1L, 3L, -9L});
  } // constructor()
} // A321173
