package irvine.oeis.a175;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A175829 Partial sums of ceiling(n^2/11).
 * @author Georg Fischer
 */
public class A175829 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A175829() {
    super(0, new long[] {0, 1, -1, 0, 1, 0, 0, 0, 0, 1, 0, -1, 1},
      new long[] {1, -3, 3, -1, 0, 0, 0, 0, 0, 0, 0, -1, 3, -3, 1});
  }
}
