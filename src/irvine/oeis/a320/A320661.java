package irvine.oeis.a320;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A320661 a(n) = 2^(n+3) - 6*n - 7.
 * @author Georg Fischer
 */
public class A320661 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A320661() {
    super(0, new long[] {1, -1, 6},
      new long[] {1, -4, 5, -2});
  }
}
