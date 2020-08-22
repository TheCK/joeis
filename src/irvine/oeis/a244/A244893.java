package irvine.oeis.a244;
// Generated by gen_seq4.pl joinlr 0 0 new long[] {1L, 0L, 0L} new long[] {3L, 2L, 3L} new long[] {2L} at 2019-07-26 00:04

import irvine.oeis.LinearRecurrence;

/**
 * A244893 a(n) = a(n-a(n-1)) with initial values 2,3,2.
 * @author Georg Fischer
 */
public class A244893 extends LinearRecurrence {

  /** Construct the sequence. */
  public A244893() {
    super(new long[] {1L, 0L, 0L}, new long[] {3L, 2L, 3L}, 2L);
  }
}
