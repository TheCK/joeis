package irvine.oeis.a301;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A301283 Coordination sequence for node of type V1 in "car" 2-D tiling (or net).
 * @author Georg Fischer
 */
public class A301283 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A301283() {
    super(0, new long[] {1, 2, 5, 5, 9, 6, 6, 3, 1, 0, -1},
      new long[] {1, -1, 2, -3, 2, -3, 2, -1, 1});
  }
}
