package irvine.oeis.a165;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A165157 Zero followed by partial sums of A133622.
 * @author Georg Fischer
 */
public class A165157 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A165157() {
    super(0, new long[] {0, 1, 2, -1, -1},
      new long[] {1, -1, -2, 2, 1, -1});
  }
}
