package irvine.oeis.a294;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A294732 Maximal diameter of the connected cubic graphs on 2*n vertices.
 * @author Georg Fischer
 */
public class A294732 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A294732() {
    super(2, new long[] {0, 0, 1, 1, 0, 1},
      new long[] {1, -1, -1, 1});
  }
}
