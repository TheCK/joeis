package irvine.oeis.a198;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A198635 Total number of round trips, each of length 2*n on the graph P_5 (o-o-o-o-o).
 * @author Georg Fischer
 */
public class A198635 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A198635() {
    super(0, new long[] {5, -12, 3},
      new long[] {1, -4, 3});
  }
}
