package irvine.oeis.a062;
// Generated by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A062113 <code>a(0)=1; a(1)=2; a(n) = a(n-1) + a(n-2)*(3 - (-1)^n)/2</code>.
 * @author Georg Fischer
 */
public class A062113 extends LinearRecurrence {

  /** Construct the sequence. */
  public A062113() {
    super(new long[] {-2L, 0L, 4L, 0L}, new long[] {1L, 2L, 3L, 7L});
  } // constructor()
} // A062113
