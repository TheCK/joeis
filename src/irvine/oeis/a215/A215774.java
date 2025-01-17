package irvine.oeis.a215;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A215774 Number of undirected labeled graphs on n+4 nodes with exactly n cycle graphs as connected components.
 * @author Georg Fischer
 */
public class A215774 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A215774() {
    super(0, new long[] {0, 12, 19, 31, 43},
      new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9, -1});
  }
}
