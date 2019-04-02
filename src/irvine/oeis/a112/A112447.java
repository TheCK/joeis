package irvine.oeis.a112;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A112447 a(2*n) = A001045(n+2); a(2*n+1) = A001045(n+1). 
 * @author Georg Fischer
 */
public class A112447 extends LinearRecurrence {

  /** Construct the sequence. */
  public A112447() {
    super(new long[] {2L, 0L, 1L, 0L}, new long[] {1L, 1L, 3L, 1L});
  } // constructor()
} // A112447
