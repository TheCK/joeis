package irvine.oeis.a063;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A063490 a(n) = (2*n - 1)*(7*n^2 - 7*n + 6)/6.
 * @author Georg Fischer
 */
public class A063490 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A063490() {
    super(1, new long[] {0, 1, 6, 6, 1},
      new long[] {1, -4, 6, -4, 1});
  }
}
