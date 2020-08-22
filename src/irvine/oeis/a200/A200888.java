package irvine.oeis.a200;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A200888 Number of 0..n arrays x(0..4) of 5 elements without any interior element greater than both neighbors.
 * @author Georg Fischer
 */
public class A200888 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A200888() {
    super(1, new long[] {0, 21, -5, 11, -16, 6, -1},
      new long[] {1, -6, 15, -20, 15, -6, 1});
  }
}
