package irvine.oeis.a318;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A318610 a(1) = 0, a(2) = 4, a(3) = 12; for n &gt; 3, a(n) = 3*a(n-1) - 3*a(n-2) + 9*a(n-3). 
 * @author Georg Fischer
 */
public class A318610 extends LinearRecurrence {

  /** Construct the sequence. */
  public A318610() {
    super(new long[] {9L, -3L, 3L}, new long[] {0L, 4L, 12L});
  } // constructor()
} // A318610
