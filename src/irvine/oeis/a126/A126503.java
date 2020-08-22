package irvine.oeis.a126;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A126503 Number of base 8 n-digit numbers with adjacent digits differing by four or less.
 * @author Georg Fischer
 */
public class A126503 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A126503() {
    super(0, new long[] {1, 2, -1, -1},
      new long[] {1, -6, -5, 3, 2});
  }
}
