package irvine.oeis.a190;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A190039 Number of nondecreasing arrangements of n+2 numbers in 0..7 with the last equal to 7 and each after the second equal to the sum of one or two of the preceding three.
 * @author Georg Fischer
 */
public class A190039 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A190039() {
    super(1, new long[] {0, 11, -5, -1, 4, 3, 5, 3},
      new long[] {1, -2, 1});
  }
}
