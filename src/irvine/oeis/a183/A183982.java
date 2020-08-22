package irvine.oeis.a183;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A183982 1/4 the number of (n+1) X 6 binary arrays with all 2 X 2 subblock sums the same.
 * @author Georg Fischer
 */
public class A183982 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A183982() {
    super(1, new long[] {0, 25, -48, -51, 96},
      new long[] {1, -3, 0, 6, -4});
  }
}
