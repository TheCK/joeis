package irvine.oeis.a132;
// Generated by gen_seq4.pl joinlr 0 0 new long[] {16L, 0L, 0L, 0L, 10L, 0L, 0L, 0L} new long[] {0L, 0L, 1L, 4L, 10L, 20L, 34L, 56L} new long[] {0L} at 2019-07-26 00:04

import irvine.oeis.LinearRecurrence;

/**
 * A132152 <code>a(4n+k) = 4a(4n+k-1)-6a(4n+k-2)+4a(4n+k-3)</code>, for k <code>= 0,1,2; 2*a(4n+3) = 7a(4n+2)-8(4n+1)+2a(4n)</code>, with <code>a(0) = a(1) = a(2) = 0, a(3) = 1</code>.
 * @author Georg Fischer
 */
public class A132152 extends LinearRecurrence {

  /** Construct the sequence. */
  public A132152() {
    super(new long[] {16L, 0L, 0L, 0L, 10L, 0L, 0L, 0L}, new long[] {0L, 0L, 1L, 4L, 10L, 20L, 34L, 56L}, new long[] {0L});
  }
}