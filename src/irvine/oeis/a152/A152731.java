package irvine.oeis.a152;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A152731 a(n) + a(n+1) + a(n+2) = n^6, a(1)=a(2)=0. 
 * @author Georg Fischer
 */
public class A152731 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152731() {
    super(new long[] {1L, -6L, 15L, -21L, 21L, -21L, 21L, -15L, 6L}, new long[] {0L, 0L, 1L, 63L, 665L, 3368L, 11592L, 31696L, 74361L});
  } // constructor()
} // A152731
