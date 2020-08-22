package irvine.oeis.a301;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A301451 Numbers congruent to {1, 7} mod 9.
 * @author Georg Fischer
 */
public class A301451 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A301451() {
    super(1, new long[] {0, 1, 6, 2},
      new long[] {1, -1, -1, 1});
  }
}
