package irvine.oeis.a094;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A094170 Number of quasi-triominoes in an n X n bounding box.
 * @author Georg Fischer
 */
public class A094170 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A094170() {
    super(0, new long[] {0, 0, -1, -7, -4, -4, -1, -1},
      new long[] {-1, 3, -1, -5, 5, 1, -3, 1});
  }
}
