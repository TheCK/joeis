package irvine.oeis.a116;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A116727 Number of permutations of length n which avoid the patterns 321, 2134, 3412.
 * @author Georg Fischer
 */
public class A116727 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A116727() {
    super(1, new long[] {0, 1, 0, 2, 4, 3},
      new long[] {1, -2, 1});
  }
}
