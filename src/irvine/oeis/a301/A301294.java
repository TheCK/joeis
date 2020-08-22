package irvine.oeis.a301;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A301294 Partial sums of A301293.
 * @author Georg Fischer
 */
public class A301294 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A301294() {
    super(0, new long[] {1, 2, 3, 2, 1},
      new long[] {1, -3, 4, -4, 3, -1});
  }
}
