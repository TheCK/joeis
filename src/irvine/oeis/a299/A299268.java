package irvine.oeis.a299;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A299268 Coordination sequence for "crs" 3D uniform tiling formed from tetrahedra and truncated tetrahedra.
 * @author Georg Fischer
 */
public class A299268 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A299268() {
    super(0, new long[] {1, 6, 15, 30, 27, 0, 1},
      new long[] {1, 0, -3, 0, 3, 0, -1});
  }
}
