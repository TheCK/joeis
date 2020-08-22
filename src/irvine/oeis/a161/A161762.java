package irvine.oeis.a161;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A161762 Sum of all numbers from Fibonacci(n-1) to Fibonacci(n).
 * @author Georg Fischer
 */
public class A161762 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A161762() {
    super(1, new long[] {0, 1, -2, -1},
      new long[] {1, -3, -1, 5, 1, -1});
  }
}
