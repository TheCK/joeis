package irvine.oeis.a212;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A212838 Number of 0..n arrays of length 5 with 0 never adjacent to n.
 * @author Georg Fischer
 */
public class A212838 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A212838() {
    super(1, new long[] {0, 2, 87, 70, -50, 12, -1},
      new long[] {1, -6, 15, -20, 15, -6, 1});
  }
}
