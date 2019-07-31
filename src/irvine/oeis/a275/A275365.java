package irvine.oeis.a275;
// Generated by gen_seq4.pl joinlr 0 0 new long[] {-1L, 0L, 2L, 0L} new long[] {2L, 2L, 4L, 2L} new long[] {0L} at 2019-07-26 00:04

import irvine.oeis.LinearRecurrence;

/**
 * A275365 <code>a(1)=2, a(2)=2</code>; thereafter <code>a(n) = a(n-a(n-1)) + a(n-a(n-2))</code>.
 * @author Georg Fischer
 */
public class A275365 extends LinearRecurrence {

  /** Construct the sequence. */
  public A275365() {
    super(new long[] {-1L, 0L, 2L, 0L}, new long[] {2L, 2L, 4L, 2L}, new long[] {0L});
  }
}