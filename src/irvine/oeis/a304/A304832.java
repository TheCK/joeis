package irvine.oeis.a304;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A304832 a(n) = n^2 + 25*n - 34 (n &gt;=2).
 * @author Georg Fischer
 */
public class A304832 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A304832() {
    super(2, new long[] {0, 0, 20, -10, -8},
      new long[] {1, -3, 3, -1});
  }
}
