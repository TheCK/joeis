package irvine.oeis.a253;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A253710 Second partial sums of tenth powers (A008454).
 * @author Georg Fischer
 */
public class A253710 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A253710() {
    super(1, new long[] {0, 1, 1013, 47840, 455192, 1310354, 1310354, 455192, 47840, 1013, 
      1},
      new long[] {1, -13, 78, -286, 715, -1287, 1716, -1716, 1287, -715, 286, -78, 
      13, -1});
  }
}
