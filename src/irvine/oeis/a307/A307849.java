package irvine.oeis.a307;
// Generated by gen_seq4.pl joinlr 0 0 new long[] {1L, -4L, 5L, 0L, -5L, 4L} new long[] {1L, 30L, 128L, 362L, 813L, 1588L} new long[] {} at 2019-07-26 00:04

import irvine.oeis.LinearRecurrence;

/**
 * A307849 Number of ways to pay n dollars using Canadian coins, that is: nickels (5 cents), dimes (10 cents), quarters (25 cents), loonies (100 cents or $1 coins) and toonies ($2 coins).
 * @author Georg Fischer
 */
public class A307849 extends LinearRecurrence {

  /** Construct the sequence. */
  public A307849() {
    super(new long[] {1L, -4L, 5L, 0L, -5L, 4L}, new long[] {1L, 30L, 128L, 362L, 813L, 1588L}, new long[] {});
  }
}
