package irvine.oeis.a167;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A167270 a(n) = Fibonacci(n + 2) + floor(n/2).
 * @author Georg Fischer
 */
public class A167270 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A167270() {
    super(0, new long[] {-1, 0, 1, 1},
      new long[] {-1, 2, 1, -3, 0, 1});
  }
}
