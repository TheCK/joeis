package irvine.oeis.a183;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A183906 Number of nondecreasing arrangements of n+2 numbers in 0..3 with each number being the sum mod 4 of two others.
 * @author Georg Fischer
 */
public class A183906 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A183906() {
    super(1, new long[] {0, 2, -3, 9, -8, -1, 2},
      new long[] {1, -4, 6, -4, 1});
  }
}
