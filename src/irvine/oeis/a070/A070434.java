package irvine.oeis.a070;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A070434 a(n) = n^2 mod 11.
 * @author Georg Fischer
 */
public class A070434 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A070434() {
    super(0, new long[] {0, -1, -4, -9, -5, -3, -3, -5, -9, -4, -1},
      new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1});
  }
}
