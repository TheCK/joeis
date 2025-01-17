package irvine.oeis.a210;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A210101 Number of (n+1) X 3 0..2 arrays with every 2 X 2 subblock having one or three distinct values, and new values 0..2 introduced in row major order.
 * @author Georg Fischer
 */
public class A210101 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A210101() {
    super(1, new long[] {0, 30, -15, -20},
      new long[] {1, -8, 3, 4});
  }
}
