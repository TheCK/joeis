package irvine.oeis.a322;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A322462 Numbers on the 0-1-12 line in a spiral on a grid of equilateral triangles.
 * @author Georg Fischer
 */
public class A322462 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A322462() {
    super(0, new long[] {0, -1, -11, 1, -1},
      new long[] {-1, 1, 2, -2, -1, 1});
  }
}
