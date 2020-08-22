package irvine.oeis.a028;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A028227 Expansion of 1/((1-7x)(1-9x)(1-11x)(1-12x)).
 * @author Georg Fischer
 */
public class A028227 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A028227() {
    super(0, new long[] {1},
      new long[] {1, -39, 563, -3561, 8316});
  }
}
