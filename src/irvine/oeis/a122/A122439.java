package irvine.oeis.a122;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A122439 Expansion of 1/(1-2x-x^2+4x^4).
 * @author Georg Fischer
 */
public class A122439 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A122439() {
    super(0, new long[] {1},
      new long[] {1, -2, -1, 0, 4});
  }
}
