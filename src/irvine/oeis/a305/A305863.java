package irvine.oeis.a305;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A305863 a(n) = 6144*5^n - 12288*4^n + 7616*3^n - 1472*2^n + 41.
 * @author Georg Fischer
 */
public class A305863 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A305863() {
    super(0, new long[] {41, 898, 479, -490, 56},
      new long[] {1, -15, 85, -225, 274, -120});
  }
}
