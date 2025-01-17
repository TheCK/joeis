package irvine.oeis.a108;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A108579 Number of symmetry classes of 3 X 3 magic squares (with distinct positive entries) having magic sum 3n.
 * @author Georg Fischer
 */
public class A108579 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A108579() {
    super(1, new long[] {0, 0, 0, 0, 0, 1, 2},
      new long[] {1, -1, -1, 0, 1, 1, -1});
  }
}
