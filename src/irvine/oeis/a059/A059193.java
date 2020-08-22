package irvine.oeis.a059;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A059193 Engel expansion of 1/e = 0.367879... .
 * @author Georg Fischer
 */
public class A059193 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A059193() {
    super(1, new long[] {0, 3, 1, 7, -3},
      new long[] {1, -3, 3, -1});
  }
}
