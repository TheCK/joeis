package irvine.oeis.a072;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A072134 Second generation sequence in which each number is skipped that can be written as sum of distinct previous entries. To make the first generation we start with all natural numbers: this gives the powers of 2 (A000079). For the second generation we start with the natural numbers from which are removed the numbers of the first generation.
 * @author Georg Fischer
 */
public class A072134 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A072134() {
    super(0, new long[] {3, 8, 2, -11, -9, -3},
      new long[] {1, 1, -3, -3});
  }
}
