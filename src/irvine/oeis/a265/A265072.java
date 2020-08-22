package irvine.oeis.a265;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A265072 Coordination sequence for (3,3,5) tiling of hyperbolic plane.
 * @author Georg Fischer
 */
public class A265072 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A265072() {
    super(0, new long[] {1, 2, 3, 3, 3, 2, 1},
      new long[] {1, -1, 0, -1, 0, -1, 1});
  }
}
