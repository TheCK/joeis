package irvine.oeis.a244;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A244586 a(n) = n OR 4.
 * @author Georg Fischer
 */
public class A244586 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A244586() {
    super(0, new long[] {4, -3, 0, 0, 0, 1},
      new long[] {1, -2, 1, 0, 1, -2, 1});
  }
}
