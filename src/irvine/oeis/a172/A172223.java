package irvine.oeis.a172;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A172223 Number of ways to place 5 nonattacking zebras on a 5 X n board.
 * @author Georg Fischer
 */
public class A172223 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A172223() {
    super(1, new long[] {0, 1, 246, 428, -1256, 5148, -2018, 266, -3296, 7258, -4232, 514, 
      -536, 898, -292, 14, -32, 14},
      new long[] {1, -6, 15, -20, 15, -6, 1});
  }
}
