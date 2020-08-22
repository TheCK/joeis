package irvine.oeis.a183;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A183909 Number of nondecreasing arrangements of n+2 numbers in 0..6 with each number being the sum mod 7 of two others.
 * @author Georg Fischer
 */
public class A183909 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A183909() {
    super(1, new long[] {0, 1, -6, 36, -32, -20, 3, 40, -16, -9, 4},
      new long[] {1, -7, 21, -35, 35, -21, 7, -1});
  }
}
