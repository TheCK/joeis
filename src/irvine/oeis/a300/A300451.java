package irvine.oeis.a300;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A300451 a(n) = (3*n^2 - 3*n + 8)*2^(n - 3). 
 * @author Georg Fischer
 */
public class A300451 extends LinearRecurrence {

  /** Construct the sequence. */
  public A300451() {
    super(new long[] {8L, -12L, 6L}, new long[] {1L, 2L, 7L});
  } // constructor()
} // A300451
