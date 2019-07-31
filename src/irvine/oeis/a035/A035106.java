package irvine.oeis.a035;
// Generated by gen_seq4.pl joinlr 0 0 new long[] {1L, -2L, 0L, 2L} new long[] {2L, 3L, 6L, 8L} new long[] {1L} at 2019-07-26 00:04

import irvine.oeis.LinearRecurrence;

/**
 * A035106 1, together with numbers of the form 1 or <code>k*(k+1)</code> or <code>k*(k+2), k &gt; 0</code>.
 * @author Georg Fischer
 */
public class A035106 extends LinearRecurrence {

  /** Construct the sequence. */
  public A035106() {
    super(new long[] {1L, -2L, 0L, 2L}, new long[] {2L, 3L, 6L, 8L}, new long[] {1L});
  }
}