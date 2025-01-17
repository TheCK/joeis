package irvine.oeis.a305;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A305750 Number of achiral color patterns (set partitions) in a row or cycle of length n with 4 or fewer colors (subsets).
 * @author Georg Fischer
 */
public class A305750 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A305750() {
    super(0, new long[] {1, 0, -3, 1},
      new long[] {1, -1, -4, 4});
  }
}
