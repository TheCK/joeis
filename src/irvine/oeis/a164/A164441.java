package irvine.oeis.a164;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A164441 Number of binary strings of length n with no substrings equal to 0000, 0110, or 1111.
 * @author Georg Fischer
 */
public class A164441 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A164441() {
    super(0, new long[] {-1, -2, -3, -5, -5, -5, -4, -2, -1},
      new long[] {-1, 0, 1, 1, 2, 1, 1});
  }
}
