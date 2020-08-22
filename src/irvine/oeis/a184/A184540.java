package irvine.oeis.a184;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A184540 Number of (n+2) X 3 binary arrays with each 3 X 3 subblock having rows and columns in lexicographically nondecreasing order.
 * @author Georg Fischer
 */
public class A184540 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A184540() {
    super(1, new long[] {0, 45, -91, 61, -14},
      new long[] {1, -4, 6, -4, 1});
  }
}
