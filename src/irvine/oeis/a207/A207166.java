package irvine.oeis.a207;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A207166 Number of n X 5 0..1 arrays avoiding 0 0 0 and 1 0 1 horizontally and 0 0 1 and 1 0 1 vertically.
 * @author Georg Fischer
 */
public class A207166 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A207166() {
    super(1, new long[] {0, 13, 104, -91, 52},
      new long[] {1, -5, 10, -10, 5, -1});
  }
}
