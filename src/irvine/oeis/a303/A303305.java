package irvine.oeis.a303;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A303305 Generalized 17-gonal (or heptadecagonal) numbers: m*(15*m - 13)/2 with m = 0, +1, -1, +2, -2, +3, -3, ... 
 * @author Georg Fischer
 */
public class A303305 extends LinearRecurrence {

  /** Construct the sequence. */
  public A303305() {
    super(new long[] {1L, -1L, -2L, 2L, 1L}, new long[] {0L, 1L, 14L, 17L, 43L});
  } // constructor()
} // A303305
