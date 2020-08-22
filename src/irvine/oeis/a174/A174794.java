package irvine.oeis.a174;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A174794 a(0) = 0 and a(n) = (4*n^3 - 12*n^2 + 20*n - 9)/3 for n &gt;= 1.
 * @author Georg Fischer
 */
public class A174794 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A174794() {
    super(0, new long[] {0, 1, 1, 3, 3},
      new long[] {1, -4, 6, -4, 1});
  }
}
