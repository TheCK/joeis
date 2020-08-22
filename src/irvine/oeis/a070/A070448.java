package irvine.oeis.a070;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A070448 a(n) = n^2 mod 26.
 * @author Georg Fischer
 */
public class A070448 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A070448() {
    super(0, new long[] {0, 1, 4, 9, 16, 25, 10, 23, 12, 3, 22, 17, 14, 13, 14, 17, 
      22, 3, 12, 23, 10, 25, 16, 9, 4, 1},
      new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
      0, 0, 0, 0, 0, 0, 0, -1});
  }
}
