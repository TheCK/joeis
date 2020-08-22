package irvine.oeis.a173;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A173729 Number of symmetry classes of 3 X 3 magilatin squares with positive values &lt; n.
 * @author Georg Fischer
 */
public class A173729 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A173729() {
    super(4, new long[] {0, 0, 0, 0, 1, 4, 8, 14, 25, 41, 52, 54, 43, 27, 13, 10, 16, 
      23, 20, 9},
      new long[] {1, 0, -2, -2, 0, 3, 3, 2, -1, -4, -4, -1, 2, 3, 3, 0, -2, 
      -2, 0, 1});
  }
}
