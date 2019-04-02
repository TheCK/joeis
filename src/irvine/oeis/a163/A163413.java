package irvine.oeis.a163;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A163413 a(n) = 14*a(n-1) - 47*a(n-2) for n &gt; 1; a(0) = 1, a(1) = 11. 
 * @author Georg Fischer
 */
public class A163413 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163413() {
    super(new long[] {-47L, 14L}, new long[] {1L, 11L});
  } // constructor()
} // A163413
