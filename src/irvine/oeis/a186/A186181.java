package irvine.oeis.a186;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A186181 Period 4 sequence [ 2, 2, 3, 2, ...] except a(0) = 1.
 * @author Georg Fischer
 */
public class A186181 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A186181() {
    super(0, new long[] {1, 2, 3, 2, 1},
      new long[] {1, 0, 0, 0, -1});
  }
}
