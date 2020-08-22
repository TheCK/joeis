package irvine.oeis.a137;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A137173 A006516 at positions with even indices, A007582 at positions with odd indices.
 * @author Georg Fischer
 */
public class A137173 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A137173() {
    super(0, new long[] {0, 1, 1, -3},
      new long[] {1, 0, -6, 0, 8});
  }
}
