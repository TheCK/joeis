package irvine.oeis.a223;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A223443 4-level binary fanout graph coloring a rectangular array: number of n X 2 0..14 arrays where 0..14 label nodes of a graph with edges 0,1 1,3 3,5 3,6 1,4 4,7 4,8 0,2 2,9 9,11 9,12 2,10 10,13 10,14 and every array movement to a horizontal or vertical neighbor moves along an edge of this graph.
 * @author Georg Fischer
 */
public class A223443 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A223443() {
    super(1, new long[] {0, 28, -64, 8},
      new long[] {1, -6, 8});
  }
}
