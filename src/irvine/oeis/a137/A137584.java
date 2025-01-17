package irvine.oeis.a137;
// Generated by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A137584 a(n) = 3*a(n-1) - 2*a(n-2) + a(n-3), n &gt; 3.
 * @author Georg Fischer
 */
public class A137584 extends LinearRecurrence {

  /** Construct the sequence. */
  public A137584() {
    super(new long[] {1L, -2L, 3L}, new long[] {3L, 6L, 13L}, 0L);
  } // constructor()
} // A137584
