package irvine.oeis.a047;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A047416 Numbers that are congruent to {0, 1, 3, 4, 6} mod 8.
 * @author Georg Fischer
 */
public class A047416 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A047416() {
    super(1, new long[] {0, 0, 1, 2, 1, 2, 2},
      new long[] {1, -1, 0, 0, 0, -1, 1});
  }
}
