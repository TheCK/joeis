package irvine.oeis.a084;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A084446 Number of triangular partitions of n of order 4.
 * @author Georg Fischer
 */
public class A084446 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A084446() {
    super(0, new long[] {1},
      new long[] {1, -4, 6, -7, 13, -20, 23, -28, 36, -45, 51, -53, 60, -67, 66, 
      -64, 66, -67, 60, -53, 51, -45, 36, -28, 23, -20, 13, -7, 6, 
      -4, 1});
  }
}
