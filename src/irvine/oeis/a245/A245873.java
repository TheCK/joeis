package irvine.oeis.a245;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A245873 Number of length 4+2 0..n arrays with some pair in every consecutive three terms totalling exactly n.
 * @author Georg Fischer
 */
public class A245873 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A245873() {
    super(1, new long[] {0, 26, 161, -15, -30, -44, -3, 1},
      new long[] {1, -3, 1, 5, -5, -1, 3, -1});
  }
}
