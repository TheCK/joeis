package irvine.oeis.a208;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A208284 Number of n X 5 0..1 arrays avoiding 0 0 0 and 0 0 1 horizontally and 0 0 1 and 1 1 0 vertically.
 * @author Georg Fischer
 */
public class A208284 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A208284() {
    super(1, new long[] {0, 16, 160, -36, -56, 16},
      new long[] {1, -6, 15, -20, 15, -6, 1});
  }
}
