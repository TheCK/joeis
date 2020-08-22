package irvine.oeis.a059;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A059997 a(n) = (n/2)*(n + 1)*(3*n + 11).
 * @author Georg Fischer
 */
public class A059997 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A059997() {
    super(1, new long[] {0, 14, -5},
      new long[] {1, -4, 6, -4, 1});
  }
}
