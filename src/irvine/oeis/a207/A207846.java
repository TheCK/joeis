package irvine.oeis.a207;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A207846 Number of 3 X n 0..1 arrays avoiding 0 0 0 and 0 0 1 horizontally and 0 0 0 and 1 1 1 vertically.
 * @author Georg Fischer
 */
public class A207846 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A207846() {
    super(1, new long[] {0, 6, 24, -6},
      new long[] {1, -2, -1});
  }
}
