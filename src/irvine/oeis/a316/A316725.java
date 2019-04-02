package irvine.oeis.a316;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A316725 Generalized 27-gonal (or icosiheptagonal) numbers: m*(25*m - 23)/2 with m = 0, +1, -1, +2, -2, +3, -3, ... 
 * @author Georg Fischer
 */
public class A316725 extends LinearRecurrence {

  /** Construct the sequence. */
  public A316725() {
    super(new long[] {1L, -1L, -2L, 2L, 1L}, new long[] {0L, 1L, 27L, 30L, 82L});
  } // constructor()
} // A316725
