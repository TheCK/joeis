package irvine.oeis.a164;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A164487 Number of binary strings of length n with no substrings equal to 0001, 1010, or 1100.
 * @author Georg Fischer
 */
public class A164487 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A164487() {
    super(0, new long[] {-1, 1, -1, 0, 1, 0, 1},
      new long[] {-1, 3, -3, 2, -2, 1});
  }
}
