package irvine.oeis.a201;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A201043 Number of -n..n arrays of 4 elements with adjacent element differences also in -n..n.
 * @author Georg Fischer
 */
public class A201043 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A201043() {
    super(1, new long[] {0, 41, 90, 46, -4, 1},
      new long[] {1, -5, 10, -10, 5, -1});
  }
}
