package irvine.oeis.a131;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A131475 a(n) = floor(n/2) * floor(n^2/2).
 * @author Georg Fischer
 */
public class A131475 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A131475() {
    super(0, new long[] {0, 0, 2, 2, 6, 2},
      new long[] {1, -1, -3, 3, 3, -3, -1, 1});
  }
}
