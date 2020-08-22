package irvine.oeis.a126;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A126505 Number of base 10 n-digit numbers with adjacent digits differing by four or less.
 * @author Georg Fischer
 */
public class A126505 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A126505() {
    super(0, new long[] {1, 3, -3, -4, 1, 1},
      new long[] {1, -7, -3, 6, 1, -1});
  }
}
