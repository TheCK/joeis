package irvine.oeis.a167;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * The number of additional armies one receives in Parker Brothers&apos; (now part of Hasbro) game of Risk for turning in the n-th set of three different or alike cards.
 * @author Georg Fischer
 */
public class A167179 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167179() {
    super(new long[] {-1, 2}, new long[] {15, 20}, new long[] {4, 6, 8, 10, 12});
  }
}
