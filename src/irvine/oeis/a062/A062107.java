package irvine.oeis.a062;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A062107 Diagonal of table A062104.
 * @author Georg Fischer
 */
public class A062107 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A062107() {
    super(1, new long[] {0, 0, 1, 0, 1},
      new long[] {1, -3});
  }
}
