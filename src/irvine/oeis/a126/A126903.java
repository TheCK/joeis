package irvine.oeis.a126;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A126903 Coordination sequence for 10-dimensional cyclotomic lattice Z[zeta_22].
 * @author Georg Fischer
 */
public class A126903 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A126903() {
    super(0, new long[] {1, 12, 67, 232, 562, 1024, 562, 232, 67, 12, 1},
      new long[] {1, -10, 45, -120, 210, -252, 210, -120, 45, -10, 1});
  }
}
