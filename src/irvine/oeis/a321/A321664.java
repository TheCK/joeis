package irvine.oeis.a321;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A321664 A sequence consisting of three disjoint copies of the Fibonacci sequence, one shifted, with the property that for any four consecutive terms the maximum term is the sum of the two minimum terms. 
 * @author Georg Fischer
 */
public class A321664 extends LinearRecurrence {

  /** Construct the sequence. */
  public A321664() {
    super(new long[] {-1L, 0L, 0L, 0L, 0L, 0L, 2L, 0L, 0L}, new long[] {0L, 1L, 1L, 1L, 2L, 1L, 2L, 3L, 2L});
  } // constructor()
} // A321664
