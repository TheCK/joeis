package irvine.oeis.a133;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A133572 Row sums of triangle A133571.
 * @author Georg Fischer
 */
public class A133572 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A133572() {
    super(1, new long[] {0, -1, -4, -2},
      new long[] {-1, 0, 4});
  }
}
