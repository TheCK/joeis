package irvine.oeis.a303;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A303611 a(n) = (-1 - (-2)^(n-2)) mod 2^n. 
 * @author Georg Fischer
 */
public class A303611 extends LinearRecurrence {

  /** Construct the sequence. */
  public A303611() {
    super(new long[] {-4L, 4L, 1L}, new long[] {2L, 1L, 11L});
  } // constructor()
} // A303611
