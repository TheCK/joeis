package irvine.oeis.a102;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A102041 a(n) = a(n-1) + last digit of a(n-1), starting at 7.
 * @author Georg Fischer
 */
public class A102041 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A102041() {
    super(1, new long[] {0, 7, 0, 4, 4, -5},
      new long[] {1, -2, 2, -2, 1});
  }
}
