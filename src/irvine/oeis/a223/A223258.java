package irvine.oeis.a223;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A223258 Rolling icosahedron footprints: number of n X 3 0..11 arrays starting with 0 where 0..11 label vertices of an icosahedron and every array movement to a horizontal or vertical neighbor moves along an icosahedral edge.
 * @author Georg Fischer
 */
public class A223258 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A223258() {
    super(1, new long[] {0, 25, -105},
      new long[] {1, -38, 129});
  }
}
