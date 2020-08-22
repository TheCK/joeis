package irvine.oeis.a215;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A215773 Number of undirected labeled graphs on n+3 nodes with exactly n cycle graphs as connected components.
 * @author Georg Fischer
 */
public class A215773 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A215773() {
    super(0, new long[] {0, 3, 4, 8},
      new long[] {1, -7, 21, -35, 35, -21, 7, -1});
  }
}
