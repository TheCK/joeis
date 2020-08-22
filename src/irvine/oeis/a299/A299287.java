package irvine.oeis.a299;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A299287 Coordination sequence for "tcd" 3D uniform tiling.
 * @author Georg Fischer
 */
public class A299287 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A299287() {
    super(0, new long[] {1, 8, 13, 8, 1},
      new long[] {1, -2, 0, 2, -1});
  }
}
