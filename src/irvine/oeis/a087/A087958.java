package irvine.oeis.a087;
// Generated by gen_seq4.pl joinlr 0 0 new long[] {-1L, 3L, 1L} new long[] {5L, 2L, 17L} new long[] {1L} at 2019-07-26 00:04

import irvine.oeis.LinearRecurrence;

/**
 * A087958 a(n) is the square of the n-th partial sum minus the n-th partial sum of the squares, divided by a(n-1), for all n&gt;=1, starting with a(0)=1, a(1)=5.
 * @author Georg Fischer
 */
public class A087958 extends LinearRecurrence {

  /** Construct the sequence. */
  public A087958() {
    super(new long[] {-1L, 3L, 1L}, new long[] {5L, 2L, 17L}, 1L);
  }
}
