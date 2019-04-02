package irvine.oeis.a319;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A319512 a(n) = 7*a(n-1) - 14*a(n-2) + 7*a(n-3), a(0) = 1, a(1) = 3, a(2) = 11. 
 * @author Georg Fischer
 */
public class A319512 extends LinearRecurrence {

  /** Construct the sequence. */
  public A319512() {
    super(new long[] {7L, -14L, 7L}, new long[] {1L, 3L, 11L});
  } // constructor()
} // A319512
