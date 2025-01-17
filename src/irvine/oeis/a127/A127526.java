package irvine.oeis.a127;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A127526 Sequence related to fifth roots of certain Fibonacci fractions.
 * @author Georg Fischer
 */
public class A127526 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A127526() {
    super(1, new long[] {0, 15, -15, 1, 1},
      new long[] {1, -3, 0, 3, -1});
  }
}
