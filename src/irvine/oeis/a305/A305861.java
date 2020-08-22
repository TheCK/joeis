package irvine.oeis.a305;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A305861 a(n) = 32*3^n - 2^(n+5) + 5.
 * @author Georg Fischer
 */
public class A305861 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A305861() {
    super(0, new long[] {5, 7, -2},
      new long[] {1, -6, 11, -6});
  }
}
