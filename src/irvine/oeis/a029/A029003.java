package irvine.oeis.a029;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A029003 Expansion of 1/((1-x)(1-x^2)(1-x^3)(1-x^9)). 
 * @author Georg Fischer
 */
public class A029003 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029003() {
    super(new long[] {-1L, 1L, 1L, 0L, -1L, -1L, 1L, 0L, 0L, 1L, -1L, -1L, 0L, 1L, 1L}, new long[] {1L, 1L, 2L, 3L, 4L, 5L, 7L, 8L, 10L, 13L, 15L, 18L, 22L, 25L, 29L});
  } // constructor()
} // A029003
