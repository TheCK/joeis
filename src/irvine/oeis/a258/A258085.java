package irvine.oeis.a258;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A258085 Strictly increasing list of F and F - 1, where F = A000045, the Fibonacci numbers.
 * @author Georg Fischer
 */
public class A258085 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A258085() {
    super(1, new long[] {0, 0, 1, 2, 1, 0, -1, -1, -1},
      new long[] {1, 0, -2, 0, 0, 0, 1});
  }
}
