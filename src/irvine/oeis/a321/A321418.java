package irvine.oeis.a321;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A321418 Number of n element multisets of the 15th roots of unity with zero sum.
 * @author Georg Fischer
 */
public class A321418 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A321418() {
    super(0, new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1},
      new long[] {1, 0, 0, -5, 0, -3, 10, 0, 15, -10, 3, -30, 5, -15, 30, -2, 
      30, -15, 5, -30, 3, -10, 15, 0, 10, -3, 0, -5, 0, 0, 1});
  }
}
