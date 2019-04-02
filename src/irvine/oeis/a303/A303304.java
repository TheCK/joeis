package irvine.oeis.a303;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A303304 Generalized 25-gonal (or icosipentagonal) numbers: m*(23*m - 21)/2 with m = 0, +1, -1, +2, -2, +3, -3, ... 
 * @author Georg Fischer
 */
public class A303304 extends LinearRecurrence {

  /** Construct the sequence. */
  public A303304() {
    super(new long[] {1L, -1L, -2L, 2L, 1L}, new long[] {0L, 1L, 22L, 25L, 67L});
  } // constructor()
} // A303304
