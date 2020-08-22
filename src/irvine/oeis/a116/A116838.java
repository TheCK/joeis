package irvine.oeis.a116;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A116838 Number of permutations of length n which avoid the patterns 1342, 3421, 4312.
 * @author Georg Fischer
 */
public class A116838 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A116838() {
    super(1, new long[] {0, -1, 11, -52, 135, -205, 183, -97, 34, -8, 1},
      new long[] {-1, 13, -72, 222, -418, 496, -369, 165, -40, 4});
  }
}
