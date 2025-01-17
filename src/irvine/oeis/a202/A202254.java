package irvine.oeis.a202;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A202254 Number of zero-sum -n..n arrays of 4 elements with adjacent element differences also in -n..n.
 * @author Georg Fischer
 */
public class A202254 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A202254() {
    super(1, new long[] {0, 7, 10, 2, 4, -1},
      new long[] {1, -3, 2, 2, -3, 1});
  }
}
