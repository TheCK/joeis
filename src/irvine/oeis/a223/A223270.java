package irvine.oeis.a223;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A223270 Rolling cube footprints: number of 2 X n 0..5 arrays starting with 0 where 0..5 label faces of a cube and every array movement to a horizontal, diagonal or antidiagonal neighbor moves across a corresponding cube edge.
 * @author Georg Fischer
 */
public class A223270 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A223270() {
    super(1, new long[] {0, 6},
      new long[] {1, -8, -32});
  }
}
