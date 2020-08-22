package irvine.oeis.a116;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A116784 Number of permutations of length n which avoid the patterns 2314, 3241, 4312.
 * @author Georg Fischer
 */
public class A116784 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A116784() {
    super(1, new long[] {0, 1, -8, 26, -40, 27, -4, -3},
      new long[] {1, -10, 40, -81, 86, -44, 8});
  }
}
