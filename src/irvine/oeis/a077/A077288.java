package irvine.oeis.a077;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A077288 First member of the Diophantine pair (m,k) that satisfies 6(m^2 + m) = k^2 + k: a(n) = m. 
 * @author Georg Fischer
 */
public class A077288 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077288() {
    super(new long[] {1L, -1L, -10L, 10L, 1L}, new long[] {0L, 1L, 3L, 14L, 34L});
  } // constructor()
} // A077288
