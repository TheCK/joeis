package irvine.oeis.a304;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A304618 a(n) = 108*n^2 - 228*n + 114 (n&gt;=2).
 * @author Georg Fischer
 */
public class A304618 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A304618() {
    super(2, new long[] {0, 0, 90, 132, -6},
      new long[] {1, -3, 3, -1});
  }
}
