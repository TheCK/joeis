package irvine.oeis.a229;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A229440 Number of n X 3 0..2 arrays with horizontal differences mod 3 never 1, vertical differences mod 3 never -1, and rows and columns lexicographically nondecreasing.
 * @author Georg Fischer
 */
public class A229440 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A229440() {
    super(1, new long[] {0, 5, -25, 57, -66, 44, -15, 2},
      new long[] {1, -7, 21, -35, 35, -21, 7, -1});
  }
}
