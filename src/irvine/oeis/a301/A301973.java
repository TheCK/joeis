package irvine.oeis.a301;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A301973 a(n) = (n^2 - 3*n + 6)*binomial(n+2,3)/4. 
 * @author Georg Fischer
 */
public class A301973 extends LinearRecurrence {

  /** Construct the sequence. */
  public A301973() {
    super(new long[] {-1L, 6L, -15L, 20L, -15L, 6L}, new long[] {0L, 1L, 4L, 15L, 50L, 140L});
  } // constructor()
} // A301973
