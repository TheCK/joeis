package irvine.oeis.a027;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A027976 n-th diagonal sum of right justified array T given by A027960.
 * @author Georg Fischer
 */
public class A027976 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A027976() {
    super(0, new long[] {1, 0, 2},
      new long[] {1, -1, -1, -1, 1, 1});
  }
}
