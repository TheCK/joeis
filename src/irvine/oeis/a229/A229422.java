package irvine.oeis.a229;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A229422 Number of n X 2 0..2 arrays with horizontal differences mod 3 never 1, vertical differences mod 3 never -1, rows lexicographically nondecreasing, and columns lexicographically nonincreasing.
 * @author Georg Fischer
 */
public class A229422 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A229422() {
    super(1, new long[] {0, 5, -13, 17, -10, 2},
      new long[] {1, -5, 10, -10, 5, -1});
  }
}
