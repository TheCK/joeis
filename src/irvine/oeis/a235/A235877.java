package irvine.oeis.a235;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A235877 Number of (n+1) X (1+1) 0..2 arrays with the minimum plus the upper median equal to the lower median plus the maximum in every 2 X 2 subblock.
 * @author Georg Fischer
 */
public class A235877 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A235877() {
    super(1, new long[] {0, 21, -54},
      new long[] {1, -5, 6});
  }
}
