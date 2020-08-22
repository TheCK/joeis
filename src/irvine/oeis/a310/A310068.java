package irvine.oeis.a310;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A310068 Coordination sequence Gal.4.25.1 where G.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A310068 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A310068() {
    super(0, new long[] {1, 2, 3, 4, 5, 6, 5, 4, 3, 2, 1},
      new long[] {1, -1, 0, 0, 1, -2, 1, 0, 0, -1, 1});
  }
}
