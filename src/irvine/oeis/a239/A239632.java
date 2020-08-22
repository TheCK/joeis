package irvine.oeis.a239;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A239632 Number of parts in all palindromic compositions of n.
 * @author Georg Fischer
 */
public class A239632 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A239632() {
    super(0, new long[] {0, 1, 3, 0, -2},
      new long[] {1, 0, -4, 0, 4});
  }
}
