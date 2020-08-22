package irvine.oeis.a299;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A299259 Coordination sequence for 3D uniform tiling formed by stacking parallel layers of the 4.8.8 2D tiling (cf. A008576).
 * @author Georg Fischer
 */
public class A299259 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A299259() {
    super(0, new long[] {1, 3, 4, 4, 3, 1},
      new long[] {1, -2, 1, -1, 2, -1});
  }
}
