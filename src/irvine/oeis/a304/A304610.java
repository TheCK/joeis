package irvine.oeis.a304;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A304610 a(n) = 157*n - 40 (n&gt;=1).
 * @author Georg Fischer
 */
public class A304610 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A304610() {
    super(1, new long[] {0, 117, 40},
      new long[] {1, -2, 1});
  }
}
