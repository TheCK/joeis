package irvine.oeis.a037;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A037140 Convolution of natural numbers n &gt;= 1 with Fibonacci numbers F(k), for k &gt;= 5.
 * @author Georg Fischer
 */
public class A037140 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A037140() {
    super(0, new long[] {5, 3},
      new long[] {1, -3, 2, 1, -1});
  }
}
