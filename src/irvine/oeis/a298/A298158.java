package irvine.oeis.a298;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A298158 a(n) = a(n-1) + 3*a(n-2) -2*a(n-3) - 2*a(n-4), where a(0) = -1, a(1) = -2, a(2) = 2, a(3) = 1. 
 * @author Georg Fischer
 */
public class A298158 extends LinearRecurrence {

  /** Construct the sequence. */
  public A298158() {
    super(new long[] {-2L, -2L, 3L, 1L}, new long[] {-1L, -2L, 2L, 1L});
  } // constructor()
} // A298158
