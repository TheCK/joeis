package irvine.oeis.a255;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A255447 A255446(2^n-1).
 * @author Georg Fischer
 */
public class A255447 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A255447() {
    super(0, new long[] {1, 1, -2, -1, 1},
      new long[] {1, -4, -3, 19, -6, -11});
  }
}
