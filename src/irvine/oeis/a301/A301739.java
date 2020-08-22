package irvine.oeis.a301;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A301739 The number of trees with 4 nodes labeled by positive integers, where each tree's label sum is n.
 * @author Georg Fischer
 */
public class A301739 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A301739() {
    super(4, new long[] {0, 0, 0, 0, 2, 2, 2, 1, 1},
      new long[] {1, -1, -2, 1, 2, 1, -2, -1, 1});
  }
}
