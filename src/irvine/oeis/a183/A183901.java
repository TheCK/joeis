package irvine.oeis.a183;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A183901 Number of nondecreasing arrangements of n+3 numbers in 0..6 with each number being the sum mod 7 of three others.
 * @author Georg Fischer
 */
public class A183901 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A183901() {
    super(1, new long[] {0, 1, -6, 150, -302, -72, 649, -548, 60, 102, -33},
      new long[] {1, -7, 21, -35, 35, -21, 7, -1});
  }
}
