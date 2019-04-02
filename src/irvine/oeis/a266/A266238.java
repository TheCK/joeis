package irvine.oeis.a266;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A266238 a(n+1) = 2^(2*n - 1) + (-1)^n * a(n), a(1) = 1. 
 * @author Georg Fischer
 */
public class A266238 extends LinearRecurrence {

  /** Construct the sequence. */
  public A266238() {
    super(new long[] {16L, 0L, 15L, 0L}, new long[] {1L, 1L, 9L, 23L});
  } // constructor()
} // A266238
