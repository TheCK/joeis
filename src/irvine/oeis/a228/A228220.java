package irvine.oeis.a228;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A228220 Number of second differences of arrays of length 5 of numbers in 0..n.
 * @author Georg Fischer
 */
public class A228220 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A228220() {
    super(1, new long[] {0, 31, 75, 15, -1},
      new long[] {1, -4, 6, -4, 1});
  }
}
