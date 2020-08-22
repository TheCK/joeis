package irvine.oeis.a131;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A131769 Number of connected components in the double Bruhat cells for simple Lie groups of type B_n (or C_n).
 * @author Georg Fischer
 */
public class A131769 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A131769() {
    super(2, new long[] {0, 0, 8, -2, -16, -8},
      new long[] {1, -4, 4});
  }
}
