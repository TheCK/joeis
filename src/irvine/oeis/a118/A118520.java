package irvine.oeis.a118;
// Generated by gen_seq4.pl joinlr 0 0 new long[] {1L, 0L, 0L, 0L, 0L, 0L} new long[] {11L, 14L, 44L, 47L, 77L, 80L} new long[] {5L, 8L} at 2019-07-26 00:04

import irvine.oeis.LinearRecurrence;

/**
 * A118520 Define sequence S_m by: initial term = m, reverse digits and add 3 to get next term. Entry shows S_5. This reaches a cycle of length 6 in 2 steps.
 * @author Georg Fischer
 */
public class A118520 extends LinearRecurrence {

  /** Construct the sequence. */
  public A118520() {
    super(new long[] {1L, 0L, 0L, 0L, 0L, 0L}, new long[] {11L, 14L, 44L, 47L, 77L, 80L}, 5L, 8L);
  }
}
