package irvine.oeis.a064;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A064835 If n mod 2 = 0 then a(n) = n^4/4 - 2*n^2 + 3*n; otherwise, a(n) = n^4/4 - 2*n^2 + 3*n - 5/4. 
 * @author Georg Fischer
 */
public class A064835 extends LinearRecurrence {

  /** Construct the sequence. */
  public A064835() {
    super(new long[] {1L, -4L, 5L, 0L, -5L, 4L}, new long[] {0L, 0L, 2L, 10L, 44L, 120L});
  } // constructor()
} // A064835
