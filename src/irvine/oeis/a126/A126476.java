package irvine.oeis.a126;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A126476 Number of base 8 n-digit numbers with adjacent digits differing by three or less.
 * @author Georg Fischer
 */
public class A126476 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A126476() {
    super(0, new long[] {1, 2, -3, -1, 1},
      new long[] {1, -6, 1, 3, -1});
  }
}
