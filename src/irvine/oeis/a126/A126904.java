package irvine.oeis.a126;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A126904 Coordination sequence for 8-dimensional cyclotomic lattice Z[zeta_24].
 * @author Georg Fischer
 */
public class A126904 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A126904() {
    super(0, new long[] {1, 16, 100, 304, 454, 304, 100, 16, 1},
      new long[] {1, -8, 28, -56, 70, -56, 28, -8, 1});
  }
}
