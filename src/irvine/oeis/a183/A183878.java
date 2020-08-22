package irvine.oeis.a183;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A183878 Number of arrangements of n+2 numbers in 0..3 with each number being the sum mod 4 of two others.
 * @author Georg Fischer
 */
public class A183878 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A183878() {
    super(1, new long[] {0, 4, -13, 258, -1087, 1318, 444, -2040, 1536, -384},
      new long[] {1, -12, 58, -148, 217, -184, 84, -16});
  }
}
