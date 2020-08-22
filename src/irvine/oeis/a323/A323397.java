package irvine.oeis.a323;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A323397 a(n) = (4^n + 15*n - 1)/9.
 * @author Georg Fischer
 */
public class A323397 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A323397() {
    super(0, new long[] {0, 2, -7},
      new long[] {1, -6, 9, -4});
  }
}
