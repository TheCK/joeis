package irvine.oeis.a255;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A255451 A255450(2^n-1).
 * @author Georg Fischer
 */
public class A255451 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A255451() {
    super(0, new long[] {1, 1},
      new long[] {1, -4, -1, 4, 8});
  }
}
