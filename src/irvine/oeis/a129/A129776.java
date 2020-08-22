package irvine.oeis.a129;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A129776 Number of maximally-clustered hexagon-avoiding permutations in S_n; the maximally-clustered hexagon-avoiding permutations are those that avoid 3421, 4312, 4321, 46718235, 46781235, 56718234, 56781234.
 * @author Georg Fischer
 */
public class A129776 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A129776() {
    super(1, new long[] {0, 1, -5, 7, -5, 1, 3},
      new long[] {1, -7, 15, -14, 8, 4, -3});
  }
}
