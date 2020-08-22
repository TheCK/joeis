package irvine.oeis.a086;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A086663 Number of non-attacking knights on a n*n board with all non-perimeteral squares removed.
 * @author Georg Fischer
 */
public class A086663 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A086663() {
    super(1, new long[] {0, 1, 2, -3, 4, 0, -4, 4},
      new long[] {1, -2, 1});
  }
}
