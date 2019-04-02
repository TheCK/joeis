package irvine.oeis.a303;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A303813 Generalized 19-gonal (or enneadecagonal) numbers: m*(17*m - 15)/2 with m = 0, +1, -1, +2, -2, +3, -3, ... 
 * @author Georg Fischer
 */
public class A303813 extends LinearRecurrence {

  /** Construct the sequence. */
  public A303813() {
    super(new long[] {1L, -1L, -2L, 2L, 1L}, new long[] {0L, 1L, 16L, 19L, 49L});
  } // constructor()
} // A303813
