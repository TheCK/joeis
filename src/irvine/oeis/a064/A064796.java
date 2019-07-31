package irvine.oeis.a064;
// Generated by gen_seq4.pl joinlr 0 0 new long[] {1L, -2L, 0L, 2L} new long[] {6L, 8L, 12L, 15L} new long[] {1L, 2L} at 2019-07-26 00:04

import irvine.oeis.LinearRecurrence;

/**
 * A064796 Largest integer m such that every permutation <code>(p_1</code>, ..., <code>p_n)</code> of <code>(1</code>, ..., <code>n)</code> satisfies <code>p_i * p_{i+1} &gt;=</code> m for some i, <code>1 &lt;= i &lt;=</code> n, where <code>p_{n+1} = p_1</code>.
 * @author Georg Fischer
 */
public class A064796 extends LinearRecurrence {

  /** Construct the sequence. */
  public A064796() {
    super(new long[] {1L, -2L, 0L, 2L}, new long[] {6L, 8L, 12L, 15L}, new long[] {1L, 2L});
  }
}