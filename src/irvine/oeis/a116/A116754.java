package irvine.oeis.a116;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A116754 Number of permutations of length n which avoid the patterns 2134, 2143, 4312.
 * @author Georg Fischer
 */
public class A116754 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A116754() {
    super(1, new long[] {0, 1, -7, 20, -25, 12, -2, -1},
      new long[] {1, -9, 32, -56, 48, -16});
  }
}
