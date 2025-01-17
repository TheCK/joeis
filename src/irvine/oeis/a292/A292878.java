package irvine.oeis.a292;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A292878 Number of ascending ballistic random walks of length n in 3-dimensions.
 * @author Georg Fischer
 */
public class A292878 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A292878() {
    super(0, new long[] {1, 1, 2},
      new long[] {1, -4, 1, -2});
  }
}
