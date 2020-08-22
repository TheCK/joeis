package irvine.oeis.a126;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A126478 Number of base 10 n-digit numbers with adjacent digits differing by three or less.
 * @author Georg Fischer
 */
public class A126478 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A126478() {
    super(0, new long[] {1, 3, -8, -6, 6},
      new long[] {1, -7, 4, 10, -6});
  }
}
