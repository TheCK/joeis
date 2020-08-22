package irvine.oeis.a088;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A088921 The number of 321- and 2143-avoiding permutations of length n.
 * @author Georg Fischer
 */
public class A088921 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A088921() {
    super(1, new long[] {0, 1, -4, 7, -5, 2},
      new long[] {1, -6, 14, -16, 9, -2});
  }
}
