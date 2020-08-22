package irvine.oeis.a183;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A183900 Number of nondecreasing arrangements of n+3 numbers in 0..5 with each number being the sum mod 6 of three others.
 * @author Georg Fischer
 */
public class A183900 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A183900() {
    super(1, new long[] {0, 3, 6, 31, -116, 102, -38, 59, -78, 38, -6},
      new long[] {1, -6, 15, -20, 15, -6, 1});
  }
}
