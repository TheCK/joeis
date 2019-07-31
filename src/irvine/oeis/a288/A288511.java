package irvine.oeis.a288;
// Generated by gen_seq4.pl joinlr 0 0 new long[] {2L, -3L, 2L, -3L, 4L, -4L, 4L, -4L, 4L, -4L, 2L, -1L, 2L} new long[] {7L, 9L, 12L, 17L, 23L, 33L, 48L, 70L, 103L, 152L, 228L, 343L, 515L} new long[] {2L, 4L, 5L} at 2019-07-26 00:04

import irvine.oeis.LinearRecurrence;

/**
 * A288511 <code>a(n) = 2*a(n-1) - a(n-2) + 2*a(n-3) - 4*a(n-4) + 4*a(n-5) - 4*a(n-6) + 4*a(n-7) - 4*a(n-8) + 4*a(n-9) - 3*a(n-10) + 2*a(n-11) - 3*a(n-12) + 2*a(n-13)</code> for <code>n &gt;= 16</code>, with initial values as shown.
 * @author Georg Fischer
 */
public class A288511 extends LinearRecurrence {

  /** Construct the sequence. */
  public A288511() {
    super(new long[] {2L, -3L, 2L, -3L, 4L, -4L, 4L, -4L, 4L, -4L, 2L, -1L, 2L}, new long[] {7L, 9L, 12L, 17L, 23L, 33L, 48L, 70L, 103L, 152L, 228L, 343L, 515L}, new long[] {2L, 4L, 5L});
  }
}