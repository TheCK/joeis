package irvine.oeis.a033;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A033817 Convolution of natural numbers n &gt;= 1 with Lucas numbers L(k) for k &gt;= -4.
 * @author Georg Fischer
 */
public class A033817 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A033817() {
    super(1, new long[] {0, 7, -11},
      new long[] {1, -3, 2, 1, -1});
  }
}
