package irvine.oeis.a115;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A115270 Diagonal sums of correlation triangle for floor((n+4)/4).
 * @author Georg Fischer
 */
public class A115270 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A115270() {
    super(0, new long[] {1, 1, 2, 2, 2, 2, 2, 2, 1, 1},
      new long[] {1, 0, 0, -1, -2, 0, 0, 2, -1, 0, 0, 1, 4, 0, 0, -4, -1, 0, 
      0, 1, -2, 0, 0, 2, 1, 0, 0, -1});
  }
}
