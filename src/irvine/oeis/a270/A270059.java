package irvine.oeis.a270;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A270059 Number of distinct digits needed to write n in all bases &gt;= 2.
 * @author Georg Fischer
 */
public class A270059 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A270059() {
    super(0, new long[] {1, 0, 1, 0, -2, 1},
      new long[] {1, -1, -1, 1});
  }
}
