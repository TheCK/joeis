package irvine.oeis.a140;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A140962 Negative values of the Inverse binomial transform of A045883.
 * @author Georg Fischer
 */
public class A140962 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A140962() {
    super(0, new long[] {0, -1, -1},
      new long[] {1, 0, -3, 2});
  }
}
