package irvine.oeis.a304;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A304389 a(n) = 126*2^n - 22 (n&gt;=1).
 * @author Georg Fischer
 */
public class A304389 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A304389() {
    super(1, new long[] {0, 230, -208},
      new long[] {1, -3, 2});
  }
}
