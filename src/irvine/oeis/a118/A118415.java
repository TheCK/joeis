package irvine.oeis.a118;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A118415 (4*n - 3) * 2^(n - 1).
 * @author Georg Fischer
 */
public class A118415 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A118415() {
    super(1, new long[] {0, 1, 6},
      new long[] {1, -4, 4});
  }
}
