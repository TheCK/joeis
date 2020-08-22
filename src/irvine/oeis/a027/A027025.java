package irvine.oeis.a027;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A027025 a(n) = T(n,n+3), T given by A027023.
 * @author Georg Fischer
 */
public class A027025 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A027025() {
    super(3, new long[] {0, 0, 0, 1, 8, 2, 0, -3},
      new long[] {1, -3, 2, 0, 1, -1});
  }
}
