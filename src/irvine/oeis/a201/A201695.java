package irvine.oeis.a201;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A201695 Number of n X 3 0..2 arrays with rows and columns lexicographically nondecreasing read forwards and nonincreasing read backwards.
 * @author Georg Fischer
 */
public class A201695 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A201695() {
    super(1, new long[] {0, 3, 3, 56, -35, 9},
      new long[] {1, -5, 10, -10, 5, -1});
  }
}
