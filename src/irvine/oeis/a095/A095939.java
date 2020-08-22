package irvine.oeis.a095;
// Generated by gen_seq4.pl joinlr 0 0 new long[] {-3L, 5L} new long[] {2L, 9L} new long[] {1L} at 2019-07-26 00:04

import irvine.oeis.LinearRecurrence;

/**
 * A095939 a(n+2) = 5a(n+1) - 3a(n) (n &gt;= 1); a(0) = 1, a(1) = 2, a(2) = 9.
 * @author Georg Fischer
 */
public class A095939 extends LinearRecurrence {

  /** Construct the sequence. */
  public A095939() {
    super(new long[] {-3L, 5L}, new long[] {2L, 9L}, 1L);
  }
}
