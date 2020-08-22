package irvine.oeis.a321;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A321257 Start with an equilateral triangle, and repeatedly append along the triangles of the previous step equilateral triangles with half their side length that do not overlap with any prior triangle; a(n) gives the number of triangles appended at n-th step.
 * @author Georg Fischer
 */
public class A321257 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A321257() {
    super(1, new long[] {0, 1, 2, 2, 4},
      new long[] {1, -4, 5, -2});
  }
}
