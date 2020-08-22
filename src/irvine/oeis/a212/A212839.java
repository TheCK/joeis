package irvine.oeis.a212;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A212839 Number of 0..n arrays of length 6 with 0 never adjacent to n.
 * @author Georg Fischer
 */
public class A212839 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A212839() {
    super(1, new long[] {0, 2, 225, 627, -130, -12, 9, -1},
      new long[] {1, -7, 21, -35, 35, -21, 7, -1});
  }
}
