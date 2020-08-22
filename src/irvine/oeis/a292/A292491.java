package irvine.oeis.a292;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A292491 p-INVERT of the odd positive integers, where p(S) = 1 + S - 2 S^2.
 * @author Georg Fischer
 */
public class A292491 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A292491() {
    super(0, new long[] {1, -3, -5, -1},
      new long[] {-1, 3, -3, 9});
  }
}
