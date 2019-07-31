package irvine.oeis.a087;
// Generated by gen_seq4.pl joinlr 0 0 new long[] {-1L, 3L, 1L} new long[] {5L, 2L, 17L} new long[] {1L} at 2019-07-26 00:04

import irvine.oeis.LinearRecurrence;

/**
 * A087958 <code>a(n)</code> is the square of the n-th partial sum minus the n-th partial sum of the squares, divided by <code>a(n-1)</code>, for all <code>n&gt;=1</code>, starting with <code>a(0)=1, a(1)=5</code>.
 * @author Georg Fischer
 */
public class A087958 extends LinearRecurrence {

  /** Construct the sequence. */
  public A087958() {
    super(new long[] {-1L, 3L, 1L}, new long[] {5L, 2L, 17L}, new long[] {1L});
  }
}