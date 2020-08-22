package irvine.oeis.a184;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A184038 1/16 the number of (n+1) X 9 0..3 arrays with all 2 X 2 subblocks having the same four values.
 * @author Georg Fischer
 */
public class A184038 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A184038() {
    super(1, new long[] {0, 1225, -2438, -2453, 4876},
      new long[] {1, -3, 0, 6, -4});
  }
}
