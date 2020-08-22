package irvine.oeis.a101;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A101096 Third differences of fifth powers (A000584).
 * @author Georg Fischer
 */
public class A101096 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A101096() {
    super(1, new long[] {0, 1, 26, 66, 26, 1},
      new long[] {1, -3, 3, -1});
  }
}
