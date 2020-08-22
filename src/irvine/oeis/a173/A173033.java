package irvine.oeis.a173;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A173033 Second diagonal under the main diagonal in A172119 written in a square (see comment).
 * @author Georg Fischer
 */
public class A173033 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A173033() {
    super(0, new long[] {1, 1, 2},
      new long[] {1, -3, 2});
  }
}
