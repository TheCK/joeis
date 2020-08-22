package irvine.oeis.a290;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A290995 p-INVERT of (1,1,1,1,1,...), where p(S) = 1 - S^8.
 * @author Georg Fischer
 */
public class A290995 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A290995() {
    super(0, new long[] {0, 0, 0, 0, 0, 0, 0, 1},
      new long[] {1, -8, 28, -56, 70, -56, 28, -8});
  }
}
