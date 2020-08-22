package irvine.oeis.a245;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A245872 Number of length 3+2 0..n arrays with some pair in every consecutive three terms totalling exactly n.
 * @author Georg Fischer
 */
public class A245872 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A245872() {
    super(1, new long[] {0, 16, 71, 34, -2, 2, -1},
      new long[] {1, -2, -1, 4, -1, -2, 1});
  }
}
