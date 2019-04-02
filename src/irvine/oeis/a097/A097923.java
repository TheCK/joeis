package irvine.oeis.a097;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A097923 G.f.: (1+x^20)/((1-x)*(1-x^3)*(1-x^5)). 
 * @author Georg Fischer
 */
public class A097923 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097923() {
    super(new long[] {1L, -1L, 0L, -1L, 1L, -1L, 1L, 0L, 1L}, new long[] {1L, 1L, 1L, 2L, 2L, 3L, 4L, 4L, 5L});
  } // constructor()
} // A097923
