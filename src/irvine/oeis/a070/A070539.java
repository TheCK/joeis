package irvine.oeis.a070;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A070539 a(n) = n^4 mod 20.
 * @author Georg Fischer
 */
public class A070539 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A070539() {
    super(0, new long[] {0, 1, 16, 1, 16, 5, 16, 1, 16, 1},
      new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1});
  }
}
