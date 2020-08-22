package irvine.oeis.a227;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A227265 Number of n X 2 0,1 arrays indicating 2 X 2 subblocks of some larger (n+1) X 3 binary array having a sum of three or less, with rows and columns of the latter in lexicographically nondecreasing order.
 * @author Georg Fischer
 */
public class A227265 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A227265() {
    super(1, new long[] {0, 3, -7, 6, 0, -1},
      new long[] {1, -5, 10, -10, 5, -1});
  }
}
