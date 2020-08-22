package irvine.oeis.a116;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A116748 Number of permutations of length n which avoid the patterns 2314, 4132, 4321.
 * @author Georg Fischer
 */
public class A116748 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A116748() {
    super(1, new long[] {0, -1, 8, -29, 58, -72, 61, -44, 24, -8, 1},
      new long[] {-1, 10, -43, 105, -162, 166, -115, 53, -15, 2});
  }
}
