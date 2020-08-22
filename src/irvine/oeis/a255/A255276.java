package irvine.oeis.a255;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A255276 A255275(2^n-1).
 * @author Georg Fischer
 */
public class A255276 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A255276() {
    super(0, new long[] {1, 0, -20, 56, -49, -36, 128, -128},
      new long[] {1, -8, 16, 24, -145, 236, -164, 24, 32});
  }
}
