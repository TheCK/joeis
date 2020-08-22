package irvine.oeis.a299;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A299286 Partial sums of A299285.
 * @author Georg Fischer
 */
public class A299286 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A299286() {
    super(0, new long[] {1, 8, 14, 17, 14, 8, 1},
      new long[] {1, -3, 3, -1, -1, 3, -3, 1});
  }
}
