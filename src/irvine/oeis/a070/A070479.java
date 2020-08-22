package irvine.oeis.a070;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A070479 a(n) = n^3 mod 17.
 * @author Georg Fischer
 */
public class A070479 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A070479() {
    super(0, new long[] {0, -1, -8, -10, -13, -6, -12, -3, -2, -15, -14, -5, -11, -4, 
      -7, -9, -16},
      new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1});
  }
}
