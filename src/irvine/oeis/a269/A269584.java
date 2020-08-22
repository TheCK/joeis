package irvine.oeis.a269;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A269584 Number of length-4 0..n arrays with no repeated value differing from the previous repeated value by more than one.
 * @author Georg Fischer
 */
public class A269584 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A269584() {
    super(1, new long[] {0, 16, -1, 15, -7, 1},
      new long[] {1, -5, 10, -10, 5, -1});
  }
}
