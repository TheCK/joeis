package irvine.oeis.a294;
// Generated by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A294070 a(n) = (1/4)*(n^2 - 2*n)^2 + (9/4)*(n^2 - 2*n) + 6.
 * @author Georg Fischer
 */
public class A294070 extends LinearRecurrence {

  /** Construct the sequence. */
  public A294070() {
    super(new long[] {1L, -5L, 10L, -10L, 5L}, new long[] {4L, 6L, 15L, 40L, 96L});
  } // constructor()
} // A294070
