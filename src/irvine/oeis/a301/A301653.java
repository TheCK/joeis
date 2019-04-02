package irvine.oeis.a301;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A301653 Expansion of x*(1 + 2*x)/((1 - x)*(1 + x)*(1 - x - x^2)). 
 * @author Georg Fischer
 */
public class A301653 extends LinearRecurrence {

  /** Construct the sequence. */
  public A301653() {
    super(new long[] {-1L, -1L, 2L, 1L}, new long[] {0L, 1L, 3L, 5L});
  } // constructor()
} // A301653
