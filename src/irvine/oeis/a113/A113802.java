package irvine.oeis.a113;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A113802 Numbers that are congruent to {2, 12} mod 14.
 * @author Georg Fischer
 */
public class A113802 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A113802() {
    super(1, new long[] {0, 2, 10, 2},
      new long[] {1, -1, -1, 1});
  }
}
