package irvine.oeis.a207;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A207066 Number of n X 6 0..1 arrays avoiding 0 0 1 and 0 1 0 horizontally and 0 0 1 and 1 0 1 vertically.
 * @author Georg Fischer
 */
public class A207066 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A207066() {
    super(1, new long[] {0, 21, 294, -147, -168, 42},
      new long[] {1, -7, 21, -35, 35, -21, 7, -1});
  }
}
