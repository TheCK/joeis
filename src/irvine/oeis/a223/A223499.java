package irvine.oeis.a223;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A223499 Petersen graph (3,1) coloring a rectangular array: number of n X 3 0..5 arrays where 0..5 label nodes of a graph with edges 0,1 0,3 3,5 3,4 1,2 1,4 4,5 2,0 2,5 and every array movement to a horizontal, diagonal or antidiagonal neighbor moves along an edge of this graph, with the array starting at 0.
 * @author Georg Fischer
 */
public class A223499 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A223499() {
    super(1, new long[] {0, 9, -20, 10},
      new long[] {1, -15, 24, -10});
  }
}
