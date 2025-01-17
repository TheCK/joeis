package irvine.oeis.a317;
// Generated by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A317186 One of many square spiral sequences: a(n) = n^2 + n - floor((n-1)/2).
 * @author Georg Fischer
 */
public class A317186 extends LinearRecurrence {

  /** Construct the sequence. */
  public A317186() {
    super(new long[] {1L, -2L, 0L, 2L}, new long[] {1L, 2L, 6L, 11L});
  } // constructor()
} // A317186
