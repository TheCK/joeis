package irvine.oeis.a079;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A079289 For even n, a(n) = a(n-2) + a(n-1) + 2^(n/2-2), n&gt;2. For odd n, a(n) = a(n-2) + a(n-1). 
 * @author Georg Fischer
 */
public class A079289 extends LinearRecurrence {

  /** Construct the sequence. */
  public A079289() {
    super(new long[] {-2L, -2L, 3L, 1L}, new long[] {1L, 1L, 2L, 3L});
  } // constructor()
} // A079289
