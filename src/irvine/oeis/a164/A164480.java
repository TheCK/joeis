package irvine.oeis.a164;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A164480 Number of binary strings of length n with no substrings equal to 0001, 0110 or 1100.
 * @author Georg Fischer
 */
public class A164480 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A164480() {
    super(0, new long[] {1, 0, 0, 1, -1, -1, 0, 0, -1},
      new long[] {1, -2, 0, 1});
  }
}
