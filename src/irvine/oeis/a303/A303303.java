package irvine.oeis.a303;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A303303 Generalized 23-gonal (or icositrigonal) numbers: m*(21*m - 19)/2 with m = 0, +1, -1, +2, -2, +3, -3, ... 
 * @author Georg Fischer
 */
public class A303303 extends LinearRecurrence {

  /** Construct the sequence. */
  public A303303() {
    super(new long[] {1L, -1L, -2L, 2L, 1L}, new long[] {0L, 1L, 20L, 23L, 61L});
  } // constructor()
} // A303303
