package irvine.oeis.a243;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A243206 Number of 3-matchings of the n X n grid graph.
 * @author Georg Fischer
 */
public class A243206 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A243206() {
    super(0, new long[] {0, 0, 0, -56, -652, -500, 288, -24, -20, 4},
      new long[] {-1, 7, -21, 35, -35, 21, -7, 1});
  }
}
