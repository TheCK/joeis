package irvine.oeis.a027;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A027928 a(n) = T(n, 2*n-5), T given by A027926.
 * @author Georg Fischer
 */
public class A027928 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A027928() {
    super(3, new long[] {0, 0, 0, 1, -3, 5, -3, 1},
      new long[] {1, -6, 15, -20, 15, -6, 1});
  }
}
