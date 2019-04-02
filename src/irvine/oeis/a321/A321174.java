package irvine.oeis.a321;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A321174 a(n) = -2*a(n-1) + a(n-2) + a(n-3), a(0) = -1, a(1) = -4, a(2) = 5. 
 * @author Georg Fischer
 */
public class A321174 extends LinearRecurrence {

  /** Construct the sequence. */
  public A321174() {
    super(new long[] {1L, 1L, -2L}, new long[] {-1L, -4L, 5L});
  } // constructor()
} // A321174
