package irvine.oeis.a253;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A253029 Number of (n+2) X (1+2) 0..2 arrays with every consecutive three elements in every row and column having exactly two distinct values, and new values 0 upwards introduced in row major order.
 * @author Georg Fischer
 */
public class A253029 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A253029() {
    super(1, new long[] {0, 297, 162},
      new long[] {1, -5, -3});
  }
}
