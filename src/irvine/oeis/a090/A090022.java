package irvine.oeis.a090;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A090022 Number of distinct lines through the origin in the n-dimensional lattice of side length 6.
 * @author Georg Fischer
 */
public class A090022 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A090022() {
    super(0, new long[] {0, 1, 10, -47},
      new long[] {1, -15, 75, -145, 84});
  }
}
