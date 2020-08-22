package irvine.oeis.a075;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A075884 Image of n at the second step of the 3x+1 algorithm.
 * @author Georg Fischer
 */
public class A075884 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A075884() {
    super(1, new long[] {0, 2, 4, 5, 1, 4, 2, 1},
      new long[] {1, 0, 0, 0, -2, 0, 0, 0, 1});
  }
}
