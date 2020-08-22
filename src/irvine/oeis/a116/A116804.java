package irvine.oeis.a116;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A116804 Number of permutations of length n which avoid the patterns 1234, 1432, 4231.
 * @author Georg Fischer
 */
public class A116804 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A116804() {
    super(1, new long[] {0, -1, 3, -6, -1, -10, -9, 1, 2, -5},
      new long[] {-1, 5, -10, 10, -5, 1});
  }
}
