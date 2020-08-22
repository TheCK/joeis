package irvine.oeis.a070;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A070476 a(n) = n^3 mod 14.
 * @author Georg Fischer
 */
public class A070476 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A070476() {
    super(0, new long[] {0, -1, -8, -13, -8, -13, -6, -7, -8, -1, -6, -1, -6, -13},
      new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1});
  }
}
