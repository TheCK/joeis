package irvine.oeis.a201;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A201975 Number of n X 2 0..3 arrays with rows and columns lexicographically nondecreasing read forwards and nonincreasing read backwards.
 * @author Georg Fischer
 */
public class A201975 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A201975() {
    super(1, new long[] {0, 4, 14, -24, 7},
      new long[] {1, -4, 6, -4, 1});
  }
}
