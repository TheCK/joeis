package irvine.oeis.a187;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A187292 Number of 7-step one or two space at a time rook's tours on an n X n board summed over all starting positions.
 * @author Georg Fischer
 */
public class A187292 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A187292() {
    super(1, new long[] {0, 0, 0, 2304, 40736, 92480, 71856, 29568, -1120, -6864, -6416, 
      -2548, -1044, -188, -44},
      new long[] {1, -3, 3, -1});
  }
}
