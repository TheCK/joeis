package irvine.oeis.a070;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A070483 a(n) = n^3 mod 21.
 * @author Georg Fischer
 */
public class A070483 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A070483() {
    super(0, new long[] {0, -1, -8, -6, -1, -20, -6, -7, -8, -15, -13, -8, -6, -13, -14, 
      -15, -1, -20, -15, -13, -20},
      new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
      0, 0, 1});
  }
}
