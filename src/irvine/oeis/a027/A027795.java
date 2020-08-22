package irvine.oeis.a027;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A027795 a(n) = 15*(n+1)*C(n+3,10).
 * @author Georg Fischer
 */
public class A027795 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A027795() {
    super(7, new long[] {0, 0, 0, 0, 0, 0, 0, 120, 45},
      new long[] {1, -12, 66, -220, 495, -792, 924, -792, 495, -220, 66, -12, 1});
  }
}
