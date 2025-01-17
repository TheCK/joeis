package irvine.oeis.a181;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A181367 Number of 2-compositions of n containing at least one 0 entry. A 2-composition of n is a nonnegative matrix with two rows, such that each column has at least one nonzero entry and whose entries sum up to n.
 * @author Georg Fischer
 */
public class A181367 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A181367() {
    super(1, new long[] {0, 2, -6, 6, -2},
      new long[] {1, -6, 10, -4});
  }
}
