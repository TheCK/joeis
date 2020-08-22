package irvine.oeis.a126;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A126099 Number of 3-indecomposable (connected) graphs on n nodes.
 * @author Georg Fischer
 */
public class A126099 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A126099() {
    super(1, new long[] {0, 1, 0, -2, 1, 5, 13, -22, -26, 32, 14, -14, -1},
      new long[] {1, -1, -2, 2, 1, -1});
  }
}
