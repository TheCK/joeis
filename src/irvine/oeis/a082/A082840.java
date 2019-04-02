package irvine.oeis.a082;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A082840 a(n) = 4*a(n-1) - a(n-2) + 3, with a(0) = -1, a(1) = 1. 
 * @author Georg Fischer
 */
public class A082840 extends LinearRecurrence {

  /** Construct the sequence. */
  public A082840() {
    super(new long[] {1L, -5L, 5L}, new long[] {-1L, 1L, 8L});
  } // constructor()
} // A082840
