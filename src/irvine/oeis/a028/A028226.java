package irvine.oeis.a028;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A028226 Expansion of 1/((1-7x)(1-9x)(1-10x)(1-12x)).
 * @author Georg Fischer
 */
public class A028226 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A028226() {
    super(0, new long[] {1},
      new long[] {1, -38, 535, -3306, 7560});
  }
}
