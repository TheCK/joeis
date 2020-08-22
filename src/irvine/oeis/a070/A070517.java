package irvine.oeis.a070;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A070517 a(n) = n^4 mod 13.
 * @author Georg Fischer
 */
public class A070517 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A070517() {
    super(0, new long[] {0, 1, 3, 3, 9, 1, 9, 9, 1, 9, 3, 3, 1},
      new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1});
  }
}
