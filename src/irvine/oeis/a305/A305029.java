package irvine.oeis.a305;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A305029 Period 10 sequence [ 0, 2, 2, 2, 2, 0, -2, -2, -2, -2, ...] except a(0) = 1.
 * @author Georg Fischer
 */
public class A305029 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A305029() {
    super(0, new long[] {1, 1, 1, 1, 1},
      new long[] {1, -1, 1, -1, 1});
  }
}
