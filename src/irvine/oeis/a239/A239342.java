package irvine.oeis.a239;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A239342 Number of 1's in all compositions of n into odd parts.
 * @author Georg Fischer
 */
public class A239342 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A239342() {
    super(0, new long[] {0, 1, 0, -2, 0, 1},
      new long[] {1, -2, -1, 2, 1});
  }
}
