package irvine.oeis.a304;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A304487 a(n) = (3 + 2*n - 3*n^2 + 4*n^3 - 3*((-1 + n) mod 2))/6. 
 * @author Georg Fischer
 */
public class A304487 extends LinearRecurrence {

  /** Construct the sequence. */
  public A304487() {
    super(new long[] {-1L, 3L, -2L, -2L, 3L}, new long[] {1L, 4L, 15L, 36L, 73L});
  } // constructor()
} // A304487
