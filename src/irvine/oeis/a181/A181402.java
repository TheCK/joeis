package irvine.oeis.a181;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A181402 Total number of positive integers below 10^n requiring 7 positive cubes in their representation as sum of cubes.
 * @author Georg Fischer
 */
public class A181402 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A181402() {
    super(1, new long[] {0, 1, 9, 63, 48},
      new long[] {1, -1});
  }
}
