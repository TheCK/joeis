package irvine.oeis.a118;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A118403 Unsigned row sums of triangle A118401; a(n) = A118402(n^2-n+2), where A118402 is the row sums of triangle A118400.
 * @author Georg Fischer
 */
public class A118403 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A118403() {
    super(0, new long[] {1, -2, 3, -2, 2},
      new long[] {1, -3, 3, -1});
  }
}
