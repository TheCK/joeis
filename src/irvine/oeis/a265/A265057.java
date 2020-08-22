package irvine.oeis.a265;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A265057 Coordination sequence for (2,3,7) tiling of hyperbolic plane.
 * @author Georg Fischer
 */
public class A265057 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A265057() {
    super(0, new long[] {1, 4, 8, 11, 12, 12, 12, 11, 8, 4, 1},
      new long[] {1, 1, 0, -1, -1, -1, -1, -1, 0, 1, 1});
  }
}
