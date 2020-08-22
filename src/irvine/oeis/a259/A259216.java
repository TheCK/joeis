package irvine.oeis.a259;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A259216 Number of (n+1) X (2+1) 0..1 arrays with each 2 X 2 subblock having clockwise pattern 0000 0011 or 0101.
 * @author Georg Fischer
 */
public class A259216 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A259216() {
    super(1, new long[] {0, 13, -16, -16},
      new long[] {1, -3, 1, 2});
  }
}
