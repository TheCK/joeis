package irvine.oeis.a303;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A303298 Generalized 21-gonal (or icosihenagonal) numbers: m*(19*m - 17)/2 with m = 0, +1, -1, +2, -2, +3, -3, ... 
 * @author Georg Fischer
 */
public class A303298 extends LinearRecurrence {

  /** Construct the sequence. */
  public A303298() {
    super(new long[] {1L, -1L, -2L, 2L, 1L}, new long[] {0L, 1L, 18L, 21L, 55L});
  } // constructor()
} // A303298
