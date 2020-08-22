package irvine.oeis.a152;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A152031 a(n) = n^5 + n^4 + n^3 + n^2 + n.
 * @author Georg Fischer
 */
public class A152031 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A152031() {
    super(0, new long[] {0, 5, 32, 66, 16, 1},
      new long[] {1, -6, 15, -20, 15, -6, 1});
  }
}
